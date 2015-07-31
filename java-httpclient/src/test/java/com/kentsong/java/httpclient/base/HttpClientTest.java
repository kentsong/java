package com.kentsong.java.httpclient.base;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.junit.Before;
import org.junit.Test;

import com.kentsong.java.httpclient.client.TestingClient;
import com.kentsong.java.httpclient.vo.Person;

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
		
		testingClient.doPost("https://tw.yahoo.com", nvps, 6, 6);
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
		
		testingClient.doGet(uri, 6, 6);
	}
	
	@Test
	public void testPostJsonObj() {
		Person person = new Person();
		person.setId(635L);
		person.setName("kent");
		String url = "http://localhost:8080/spring-mvc-restful/rest/jsonObj";
		Person newPerson = testingClient.doPost(url, person, Person.class, 6, 6);
		System.out.println("newPerson.getId()" + newPerson.getId());
		System.out.println("newPerson.getName()" + newPerson.getName());
		
	}
	
	@Test
	public void testGet2() {
		testingClient.doGet("http://www.google.com.tw", 6, 6);
	}

}
