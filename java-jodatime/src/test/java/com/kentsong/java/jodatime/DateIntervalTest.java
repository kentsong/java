package com.kentsong.java.jodatime;

import java.util.Date;

import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.junit.Assert;
import org.junit.Test;

public class DateIntervalTest {

	@Test
	public void betweenTest() {
		Assert.assertTrue(isBetweenDate("20150501", "20150520", "20150510") );
		Assert.assertTrue(isBetweenDate("20150501", "20150520", "20150501") );
		Assert.assertTrue(isBetweenDate("20150501", "20150520", "20150520") );
		Assert.assertFalse(isBetweenDate("20150501", "20150520", "20150630") );
		Assert.assertFalse(isBetweenDate("20150501", "20150520", "20140130") );
	}
	
	private boolean isBetweenDate(String startDay, String endDay, String currDay){
		LocalDate sDay = LocalDate.parse(startDay, DateTimeFormat.forPattern("yyyyMMdd"));
		LocalDate eDay = LocalDate.parse(endDay, DateTimeFormat.forPattern("yyyyMMdd"));
		LocalDate cDay = LocalDate.parse(currDay, DateTimeFormat.forPattern("yyyyMMdd"));
		
		if(cDay.isEqual(sDay) || cDay.isEqual(eDay))
			return true;
		
		if(cDay.isBefore(eDay) && cDay.isAfter(sDay)){
			return true;
		} else{
			return false;
		}
		
	}
	
	@Test
	public void equalTest() {
		LocalDate ld = new LocalDate(2015,10,10);
		Assert.assertTrue(new LocalDate(2015,10,10).equals(ld));
		Assert.assertTrue(LocalDate.parse("20151010", DateTimeFormat.forPattern("yyyyMMdd")).equals(ld));
		Assert.assertFalse(new LocalDate(new Date()).equals(ld));
		
	}
	
	@Test
	public void beforeTest() {
		LocalDateTime ldt = new LocalDateTime(2015,10,10,8,10,0);
		Assert.assertTrue(new LocalDateTime(2014,10,10,1,10,10).isBefore(ldt));
		Assert.assertTrue(new LocalDateTime(2015,10,10,1,10,10).isBefore(ldt));
		Assert.assertFalse(new LocalDateTime(2016,10,10,1,10,10).isBefore(ldt));
		Assert.assertFalse(new LocalDateTime(2015,10,10,18,10,10).isBefore(ldt));
		
	}
	
	@Test
	public void afterTest() {
		LocalDateTime ldt = new LocalDateTime(2015,10,10,8,10,0);
		Assert.assertFalse(new LocalDateTime(2014,10,10,1,10,10).isAfter(ldt));
		Assert.assertFalse(new LocalDateTime(2015,10,10,1,10,10).isAfter(ldt));
		Assert.assertTrue(new LocalDateTime(2016,10,10,1,10,10).isAfter(ldt));
		Assert.assertTrue(new LocalDateTime(2015,10,10,18,10,10).isAfter(ldt));
		
	}
	
	
	
	
	
	
	
	
	

}
