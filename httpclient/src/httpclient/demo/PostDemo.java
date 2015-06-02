package httpclient.demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

/**
 * httpclient post
 * @author Kent
 */

public class PostDemo {
	
	private static final Integer SOCKET_SECONDS = 6;
	private static final Integer CONNECT_SECONDS = 6;
	
	public static void doPost(){
		CloseableHttpClient httpclient = HttpClients.createDefault();
		
		try{
			HttpPost httpPost = new HttpPost("http://www.treemall.com.tw/leho/leho");
			List <NameValuePair> nvps = new ArrayList <NameValuePair>();
			nvps.add(new BasicNameValuePair("ACT", "typesetWorksWall"));
			nvps.add(new BasicNameValuePair("lhwNo", "163"));
			httpPost.setEntity(new UrlEncodedFormEntity(nvps));
			
			RequestConfig config = RequestConfig.custom()
				    .setSocketTimeout(SOCKET_SECONDS * 1000)
				    .setConnectTimeout(CONNECT_SECONDS * 1000)
				    .build();
			httpPost.setConfig(config);
			System.out.println("==>"+httpPost.getURI());
			
			CloseableHttpResponse response = httpclient.execute(httpPost);
			try {
			    System.out.println(response.getStatusLine());
			    HttpEntity entity = response.getEntity();
			    String result = EntityUtils.toString(entity, "UTF-8"); 
			    System.out.println("result:" + result);
			}
			finally {
			    response.close();
			}
		}catch(ClientProtocolException e){
			System.out.println("ClientProtocolException error:"+ e);
		} 
		catch(IOException e){
			System.out.println("IOException error:" + e);
		}
		catch(Exception e){
			System.out.println("Exception error:" + e);
		}
		finally{
			try {
				httpclient.close();
			} catch (IOException e) {
				System.out.println("httpclient.close fail!" + e);
			}
		}
		
		
	}
	
	public static void main(String[] args) throws IOException {
		doPost();
		
	}
	
	
}
