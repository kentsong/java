package com.kentsong.java.httpclient.base;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpServiceUrlUtil {

	public static String urlPrefix = "";
	private static Logger logger = LoggerFactory.getLogger(HttpServiceUrlUtil.class);
	
	//只要讀不到url就丟例外
	static {
		Properties properties = new Properties();
		try {
			InputStream inputStream = HttpServiceUrlUtil.class.getClassLoader().getResourceAsStream("restful.properties");
			if (inputStream == null) {
				throw new FileNotFoundException();
			}
			
			properties.load(inputStream);
		    String url = properties.getProperty("app.jellybean.client.url");
		    if (!StringUtils.isBlank(url)) {
		    	urlPrefix = url;
		    } else {
		    	throw new IllegalArgumentException("property: 'app.jellybean.client.url' not found");
		    }
		} catch (IOException e) {
			logger.error("load restful.properties fail...");
			throw new RuntimeException("load restful.properties fail...", e);
		}
	}
	
	
}
