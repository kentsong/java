package com.kentsong.java.jodatime;

import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.junit.Assert;
import org.junit.Test;

public class DateCalculateTest {

	@Test
	public void datePlusTest() {
		//日期加法
		LocalDate ld = new LocalDate(2015,5,1);
		Assert.assertTrue(ld.plusDays(3).toString("yyyyMMdd").equals("20150504"));
		Assert.assertTrue(ld.plusWeeks(1).toString("yyyyMMdd").equals("20150508"));
		Assert.assertTrue(ld.plusMonths(1).toString("yyyyMMdd").equals("20150601"));
		Assert.assertTrue(ld.plusYears(1).toString("yyyyMMdd").equals("20160501"));
		
		LocalDateTime ldt = new LocalDateTime(2015,5,1,10,10,0);
		Assert.assertTrue(ldt.plusHours(1).toString("yyyyMMdd HH:mm:ss").equals("20150501 11:10:00"));
		Assert.assertTrue(ldt.plusMinutes(5).toString("yyyyMMdd HH:mm:ss").equals("20150501 10:15:00"));
		Assert.assertTrue(ldt.plusSeconds(20).toString("yyyyMMdd HH:mm:ss").equals("20150501 10:10:20"));
		
	}
	
	@Test
	public void dateMinusTest() {
		//日期減法
		LocalDate ld = new LocalDate(2015,5,20);
		Assert.assertTrue(ld.minusDays(5).toString("yyyyMMdd").equals("20150515"));
		Assert.assertTrue(ld.minusWeeks(1).toString("yyyyMMdd").equals("20150513"));
		Assert.assertTrue(ld.minusMonths(1).toString("yyyyMMdd").equals("20150420"));
		Assert.assertTrue(ld.minusYears(1).toString("yyyyMMdd").equals("20140520"));
		
		LocalDateTime ldt = new LocalDateTime(2015,5,1,18,50,0);
		Assert.assertTrue(ldt.minusHours(1).toString("yyyyMMdd HH:mm:ss").equals("20150501 17:50:00"));
		Assert.assertTrue(ldt.minusMinutes(5).toString("yyyyMMdd HH:mm:ss").equals("20150501 18:45:00"));
		Assert.assertTrue(ldt.minusSeconds(20).toString("yyyyMMdd HH:mm:ss").equals("20150501 18:49:40"));
		
	}

}
