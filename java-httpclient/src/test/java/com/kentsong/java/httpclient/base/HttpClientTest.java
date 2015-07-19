package com.kentsong.java.httpclient.base;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.junit.Before;
import org.junit.Test;

import com.kentsong.java.httpclient.client.TestingClient;

public class HttpClientTest {

	private TestingClient testingClient;
	
	@Before
	public void setup(){
		testingClient = new TestingClient();
	}
	
	@Test
	public void testPost() {
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		nvps.add(new BasicNameValuePair("username", "vip"));
		nvps.add(new BasicNameValuePair("passwd", "pwd"));
		nvps.add(new BasicNameValuePair("cproNums", "123"));
		nvps.add(new BasicNameValuePair("cproNums", "456"));
		
		try {
			String theString = IOUtils.toString(new UrlEncodedFormEntity(nvps).getContent(), "UTF-8");
			System.out.println("httpPost params: " + theString);
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} 
		
		String resultHtml = testingClient.doPost("https://tw.yahoo.com", nvps, 6, 6);
		//System.out.println(resultHtml);
	}
	
	@Test
	public void testGet() {
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		nvps.add(new BasicNameValuePair("username", "vip"));
		nvps.add(new BasicNameValuePair("passwd", "pwd"));
		nvps.add(new BasicNameValuePair("cproNums", "123"));
		nvps.add(new BasicNameValuePair("cproNums", "456"));
		
		URI uri;
		try {
			uri = new URIBuilder()
			.setPath("https://tw.yahoo.com")
			.setParameters(nvps)
			.build();
		} catch (URISyntaxException e) {
			throw new RuntimeException("URISyntaxException error: ", e);
		}
		
		System.out.println("httpGet params: "+ uri.getQuery());
		
		String resultHtml = testingClient.doGet(uri, 6, 6);
		//System.out.println(resultHtml);
	}

}
