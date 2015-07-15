package com.kentsong.java.commons.clone;

import static org.junit.Assert.*;

import org.junit.Test;

import com.kentsong.java.commons.clone.vo.IronMan;
import com.kentsong.java.commons.clone.vo.Man;
import com.kentsong.java.commons.clone.vo.SpiderMan;

public class ObjectCloneTest {

	@Test
	public void propertiesCloneTest() {
		SpiderMan spiderMan = new SpiderMan();
		Man man = new Man();
		ObjectClone.propertiesClone(man, spiderMan);
		
		//比對名子、特色
		assertEquals(man.getName(), spiderMan.getName());
		assertEquals(man.getFeature(), spiderMan.getFeature());
	}
	
	@Test
	public void deepCloneTest() {
		//Object必須序列化才能clone
		IronMan ironMan = new IronMan();
		IronMan ironMaBakup = (IronMan) ObjectClone.deepClone(ironMan);
		
		//比對名子、特色
		assertEquals(ironMaBakup.getName(), ironMan.getName());
		assertEquals(ironMaBakup.getFeature(), ironMan.getFeature());
		assertNotEquals(ironMaBakup.hashCode(), ironMan.hashCode());
	}
	

}
