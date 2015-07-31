package com.kentsong.java.httpclient.base;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.kentsong.java.httpclient.pool.HttpClientConnectionPool;
import com.kentsong.java.httpclient.serializer.JsonRedisSerializer;

public abstract class AbstractRestfulClient {

	private static Logger logger = LoggerFactory.getLogger(AbstractRestfulClient.class);
	
	private JsonRedisSerializer jsonRedisSerializer = new JsonRedisSerializer();
	
	protected <T> T doPost(String url, Object obj, Class<T> clazz, int socketSec, int connectSec) {
		CloseableHttpClient httpclient = HttpClientConnectionPool.getHttpClient();
		
		HttpPost httpPost = new HttpPost(url);
		RequestConfig config = RequestConfig.custom()
				.setSocketTimeout(socketSec * 1000)
				.setConnectTimeout(connectSec * 1000).build();
		httpPost.setConfig(config);
		
		String requestBody = jsonRedisSerializer.seriazileAsString(obj);
		System.out.println("requestBody:"+requestBody);
		ByteArrayEntity entity = null;
		try {
			entity = new ByteArrayEntity(requestBody.getBytes("UTF-8"));
			entity.setContentType("application/json");
			httpPost.setEntity(entity);
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException("UnsupportedEncodingException error: ", e);
		}
		
		
		try {
			CloseableHttpResponse response = httpclient.execute(httpPost);
			
			if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
				String result = this.parseResponse(response);
				response.close();
				return jsonRedisSerializer.deserializeAsObject(result, clazz);
			} else {
				response.close();
				throw new IllegalStateException("HttpStatus: " + response.getStatusLine().getStatusCode() + ", url: " + url);
			}
		} catch (ClientProtocolException e) {
			logger.error("ClientProtocolException error: ", e);
			throw new RuntimeException(e);
		} catch (IOException e) {
			logger.error("IOException error: ", e);
			throw new RuntimeException(e);
		}
	}
	
	protected <T> T doGet(String url, Class<T> clazz, int socketSec, int connectSec) {
		CloseableHttpClient httpclient = HttpClientConnectionPool.getHttpClient();
		
		HttpGet httpget = new HttpGet(url);
		RequestConfig config = RequestConfig.custom()
				.setSocketTimeout(socketSec * 1000)
				.setConnectTimeout(connectSec * 1000).build();
		httpget.setConfig(config);
		
		try {
			CloseableHttpResponse response = httpclient.execute(httpget);
			if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
				String result = this.parseResponse(response);
				response.close();
				return jsonRedisSerializer.deserializeAsObject(result, clazz);
			} else {
				response.close();
				throw new IllegalStateException("HttpStatus: " + response.getStatusLine().getStatusCode() + ", url: " + url);
			}
		} catch (ClientProtocolException e) {
			logger.error("ClientProtocolException error: ", e);
			throw new RuntimeException(e);
		} catch (IOException e) {
			logger.error("IOException error: ", e);
			throw new RuntimeException(e);
		}
	}
	
	protected String parseResponse(HttpResponse response) {
		HttpEntity entity = response.getEntity();
		try {
			return EntityUtils.toString(entity, "UTF-8");
		} catch (ParseException e) {
			logger.error("ParseException error: ", e);
			throw new RuntimeException(e);
		} catch (IOException e) {
			logger.error("IOException error: ", e);
			throw new RuntimeException(e);
		}
	}
	
	protected <T> T doPost(String url, int socketSec, int connectSec){
		return this.doPost(url, null, socketSec, connectSec);
	}
	
	protected <T> T doPost(String url, List<NameValuePair> nvps, int socketSec, int connectSec){
		HttpPost httpPost = new HttpPost(url);
		RequestConfig config = RequestConfig.custom()
				.setSocketTimeout(socketSec * 1000)
				.setConnectTimeout(connectSec * 1000).build();
		httpPost.setConfig(config);
		
		try {
			if(nvps !=null && nvps.size() > 0){
				httpPost.setEntity(new UrlEncodedFormEntity(nvps));
			}
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException("UnsupportedEncodingException error: ", e);
		}
		
		CloseableHttpClient httpClient = HttpClientConnectionPool.getHttpClient();
		try {
			CloseableHttpResponse response = httpClient.execute(httpPost);
			if(response.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
				String result = this.parseResponse(response);
				response.close();
				return (T) result;
			} else {
				response.close();
				throw new IllegalStateException("HttpStatus: " + response.getStatusLine().getStatusCode() + ", url: " + url);
			}
			
		} catch (ClientProtocolException e) {
			throw new RuntimeException("ClientProtocolException error: ", e);
		} catch (IOException e) {
			throw new RuntimeException("IOException error: ", e);
		} 
		
	}
	
	protected <T> T doGet(String url, int socketSec, int connectSec){
		HttpGet httpGet = new HttpGet(url);
		RequestConfig config = RequestConfig.custom()
				.setSocketTimeout(socketSec * 1000)
				.setConnectTimeout(connectSec * 1000).build();
		httpGet.setConfig(config);
		
		CloseableHttpClient httpClient = HttpClientConnectionPool.getHttpClient();
		PoolingHttpClientConnectionManager cm = (PoolingHttpClientConnectionManager) httpClient.getConnectionManager();
		try {
			CloseableHttpResponse response = httpClient.execute(httpGet);
			if(response.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
				String result = this.parseResponse(response);
				response.close();
				return (T) result;
			} else {
				response.close();
				throw new IllegalStateException("HttpStatus: " + response.getStatusLine().getStatusCode() + ", url: " + httpGet.getURI());
			}
			
		} catch (ClientProtocolException e) {
			throw new RuntimeException("ClientProtocolException error: ", e);
		} catch (IOException e) {
			throw new RuntimeException("IOException error: ", e);
		} 
	}
	
	protected <T> T doGet(URI uri, int socketSec, int connectSec){
		HttpGet httpGet = new HttpGet();
		RequestConfig config = RequestConfig.custom()
				.setSocketTimeout(socketSec * 1000)
				.setConnectTimeout(connectSec * 1000).build();
		httpGet.setConfig(config);
		httpGet.setURI(uri);
		
		CloseableHttpClient httpClient = HttpClientConnectionPool.getHttpClient();
		try {
			CloseableHttpResponse response = httpClient.execute(httpGet);
			if(response.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
				String result = this.parseResponse(response);
				response.close();
				return (T) result;
			} else {
				response.close();
				throw new IllegalStateException("HttpStatus: " + response.getStatusLine().getStatusCode() + ", url: " + httpGet.getURI());
			}
			
		} catch (ClientProtocolException e) {
			throw new RuntimeException("ClientProtocolException error: ", e);
		} catch (IOException e) {
			throw new RuntimeException("IOException error: ", e);
		} 
		
	}

}
