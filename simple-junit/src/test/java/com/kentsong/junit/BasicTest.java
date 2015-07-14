package com.kentsong.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * @author KentSong
 */

@RunWith(JUnit4.class)
public class BasicTest {

	public String message;
	
	public BasicTest(){
		message = "Hello World!!";
		System.out.println(message);
	}
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("beforeClass method is work!");
	}
	
	@AfterClass
	public static void afterClass(){
		System.out.println("afterClass method is work!");
	}
	
	@Before
	public void before(){
		System.out.println("before method is work!");
	}
	
	@After
	public void after(){
		System.out.println("after method is work!");
	}
		
	@Test
	public void testCaseA(){
		System.out.println("testCaseA method is work!");
	}
	
	@Test
	public void testCaseB(){
		System.out.println("testCaseB method is work!");
	}
		

}
