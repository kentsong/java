package com.kentsong.java.commons.clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.PropertyUtilsBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ObjectClone {
	
	private static final Logger logger = LoggerFactory.getLogger(ObjectClone.class);
	
	/**
	 * 藉由I/O Stream 寫入新的Object
	 * Object 必須序列化才能使用
	 * @param obj
	 * @return
	 */
	public static Object deepClone(Object obj) {
		try{
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(obj);
			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bais);
			return ois.readObject();
			
		} catch(ClassNotFoundException e){
			logger.error("deepClone", e);
			throw new RuntimeException(e);
		} catch(IOException e){
			logger.error("deepClone", e);
			throw new RuntimeException(e);
		}
		
	}
	
	/**
	 * clone Object中的property, 不一定要是同名的Object, 只要有共同型態的property
	 * @param targetObj
	 * @param oriObj
	 * @return
	 */
	public static Object propertiesClone(Object targetObj, Object oriObj){
		PropertyUtilsBean propertyUtilsBean = new PropertyUtilsBean();
		
		try {
			propertyUtilsBean.copyProperties(targetObj, oriObj);
			return targetObj;
		} catch (IllegalAccessException e) {
			logger.error("propertiesClone", e);
			throw new RuntimeException(e);
		} catch (InvocationTargetException e) {
			logger.error("propertiesClone", e);
			throw new RuntimeException(e);
		} catch (NoSuchMethodException e) {
			logger.error("propertiesClone", e);
			throw new RuntimeException(e);
		}
			
	}
	
	
	
	

}
