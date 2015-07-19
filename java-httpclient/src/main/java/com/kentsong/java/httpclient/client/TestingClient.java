package com.kentsong.java.httpclient.client;

import com.kentsong.java.httpclient.base.AbstractRestfulClient;

public class TestingClient extends AbstractRestfulClient{
	
	public void testPost(){
		
		this.doPost("http://www.google.com.tw", null, 6, 6);
		
	}

}
