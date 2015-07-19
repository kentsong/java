package com.kentsong.java.jodatime;

import static org.junit.Assert.*;

import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.junit.Test;

public class DateFormatterTest {

	@Test
	public void test() {
		
		System.out.println("����榡 (yyyyMMdd) = "+LocalDate.now().toString("yyyyMMdd"));
		System.out.println("����榡 (yyyy/MM/dd) = "+LocalDate.now().toString("yyyy/MM/dd"));
		System.out.println("����榡 (yyyy-MM-dd) = "+LocalDate.now().toString("yyyy-MM-dd"));
		
		System.out.println("========================================");
		
		System.out.println("����ɶ��榡 (yyyyMMdd HH:mm:ss) = "+LocalDateTime.now().toString("yyyyMMdd HH:mm:ss"));
		System.out.println("����ɶ��榡 (yyyy/MM/dd HH:mm:ss) = "+LocalDateTime.now().toString("yyyy/MM/dd HH:mm:ss"));
		System.out.println("����ɶ��榡 (yyyy-MM-dd HH:mm:ss) = "+LocalDateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
	
	
	
	}

}
