package com.kentsong.junit;

import org.junit.Test;

public class TimeTest {

	@Test(timeout = 1000)  
	public void infinity() {  
		while (true);  
	}  

}	
