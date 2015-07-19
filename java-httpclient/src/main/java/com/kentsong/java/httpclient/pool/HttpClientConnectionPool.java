package com.kentsong.java.httpclient.pool;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.SSLContext;

import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContextBuilder;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;

/**
 * HttpCleint連接池
 * 
 * @author 635_kentsong
 */
public class HttpClientConnectionPool {

	private static final int MAX_POOL = 5000;
	private static final int DEFAULT_MAXPER_ROUTE = 5000;
	private static CloseableHttpClient httpclient = null;

	private HttpClientConnectionPool() {
	}

	private static void createHttpclient() {
		try {
			SSLContextBuilder builder = SSLContexts.custom();
			//下面這段程式碼是信任所有憑證...
			builder.loadTrustMaterial(null, new TrustStrategy() {
				public boolean isTrusted(X509Certificate[] chain,
						String authType) throws CertificateException {
					return true;
				}
			});
			
			SSLContext sslContext = builder.build();
			SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslContext);
			
			Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory> create()
					.register("http", new PlainConnectionSocketFactory())
					.register("https", sslsf).build();
			
			PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager(socketFactoryRegistry);
			cm.setMaxTotal(MAX_POOL);
			cm.setDefaultMaxPerRoute(DEFAULT_MAXPER_ROUTE);
			
			httpclient = HttpClients.custom().setConnectionManager(cm).build();
		} catch (KeyManagementException e) {
			throw new RuntimeException(e);
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		} catch (KeyStoreException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 從Pool取得httpclient,注意! 請不要close掉它
	 * @return
	 */
	public static CloseableHttpClient getHttpClient() {
		if (httpclient == null) {
			synchronized (HttpClientConnectionPool.class) {
				if (httpclient == null) {
					createHttpclient();
				}
			}
		}
		return httpclient;
	}

}
