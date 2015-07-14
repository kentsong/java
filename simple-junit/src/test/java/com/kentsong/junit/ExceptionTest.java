package com.kentsong.junit;

import org.junit.Test;

/**
 * @author KentSong
 */

public class ExceptionTest {

	@Test(expected = NumberFormatException.class)  
	public void numberFormatException() {  
	  Integer.parseInt("it's not numbers");
	}  
	
	@Test(expected = ArithmeticException.class)  
	public void divisionWithException() {  
	  int i = 1/0;
	}  

}
