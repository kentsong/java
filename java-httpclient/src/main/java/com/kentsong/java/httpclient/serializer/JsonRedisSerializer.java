package com.kentsong.java.httpclient.serializer;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class JsonRedisSerializer {

public static final String EMPTY_JSON = "{}";
	
	public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");
	
	protected ObjectMapper objectMapper = new ObjectMapper();
	public JsonRedisSerializer() {
		
	}
	
	/**
	 * java-object as json-string
	 * @param object
	 * @return
	 */
	public String seriazileAsString(Object object) {
		if (object == null) {
			return EMPTY_JSON;
		}
		try {
			//加這行如果是null就不會被組進json
			objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
			return this.objectMapper.writeValueAsString(object);
		} catch (Exception ex) {
			throw new RuntimeException("Could not write JSON: " + ex.getMessage(), ex);
		}
	}
	
	/**
	 * json-string to java-object
	 * @param str
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public <T> T deserializeAsObject(String str, Class<T> clazz) {
		if (str == null || clazz == null) {
			return null;
		} else if (String.class == clazz) {
			return (T) str;
		}
		try {
			return this.objectMapper.readValue(str, clazz);
		} catch (Exception ex) {
			throw new RuntimeException("Could not write JSON: " + ex.getMessage(), ex);
		}
	}
	
	public <T> List<T> deserializeAsList(String str, Class<T> clazz) {
		if (str == null || clazz == null) {
			return null;
		}
		try {
			TypeFactory t = TypeFactory.defaultInstance();
			return this.objectMapper.readValue(str, t.constructCollectionType(ArrayList.class, clazz));
		} catch (Exception ex) {
			throw new RuntimeException("Could not write JSON: " + ex.getMessage(), ex);
		}
	}
	
}
