package httpclient.demo;

import httpclient.demo.util.ParamsUnit;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * httpclient get
 * @author Kent
 */

public class GetDemo {

	private static final Integer SOCKET_SECONDS = 6;
	private static final Integer CONNECT_SECONDS = 6;
	
	public static void doGet(Integer[] cpdtNums, Integer[] qtys, String platform) {
		
		final String HTTP_URL = "https://tw.search.yahoo.com/search";
		
		CloseableHttpClient httpclient = HttpClients.createDefault();
		try{
			
			URI uri = new URIBuilder()
		    .setPath(HTTP_URL)
		    .setParameter("cpdtNums", ParamsUnit.parseArrayParams(cpdtNums))
		    .setParameter("qtys", ParamsUnit.parseArrayParams(qtys))
		    .setParameter("platform", platform)
		    .setParameter("p", "vip")
		    .build();
			
		    HttpGet httpget = new HttpGet(uri);
		    System.out.println("==>"+httpget.getURI());
		    
		    RequestConfig config = RequestConfig.custom()
		    .setSocketTimeout(SOCKET_SECONDS * 1000)
		    .setConnectTimeout(CONNECT_SECONDS * 1000)
		    .build();
		    httpget.setConfig(config);
		   
		    
		    CloseableHttpResponse response = httpclient.execute(httpget);
		    System.out.println(response.getStatusLine());
		    try{
		    	if(response.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
		    		System.out.println(response);
		    		String result = EntityUtils.toString(response.getEntity(), "UTF-8");
		    		System.out.println("result:"+result);
		    	}
		    	
		    }finally{
		    	response.close();
		    }
		} 
		catch(ClientProtocolException e){
			System.out.println("ClientProtocolException error:"+ e);
		} 
		catch(IOException e){
			System.out.println("IOException error:" + e);
		}
		catch(URISyntaxException e){
			System.out.println("URISyntaxException error:" + e);
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
	
	
	public static void main(String[] args) {
		
		Integer[] cpdtNums = new Integer[]{1155784,6475586};
		Integer[] qtys = new Integer[]{1,4};
		String platform = "E";
		
		doGet(cpdtNums, qtys, platform);
		      
	}
	
	
	
	
}
