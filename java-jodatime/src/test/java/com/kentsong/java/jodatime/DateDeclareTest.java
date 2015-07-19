package com.kentsong.java.jodatime;

import java.util.Calendar;
import java.util.Date;




import org.joda.time.DateTimeConstants;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.junit.Assert;
import org.junit.Test;

public class DateDeclareTest {

	@Test
	public void declareTest1() {
		
		System.out.println("取得目前日期:" + LocalDate.now().toDate());
		System.out.println("取得目前日期時間:" + LocalDateTime.now().toDate());
		System.out.println("自訂日期:" + new LocalDate(2014,10,10).toDate());
		System.out.println("自訂日期時間:" + new LocalDateTime(2014,10,10,19,20,0).toDate());
		System.out.println("==============================");
		System.out.println("使用java.util.Date初始化:"+ new LocalDate(new Date()).toDate());
		System.out.println("使用java.lang.String初始化:"+ LocalDate.parse("20150801", DateTimeFormat.forPattern("yyyyMMdd")));
		System.out.println("使用java.lang.String初始化:"+ LocalDateTime.parse("2015/08/01 10:50:10", DateTimeFormat.forPattern("yyyy/MM/dd HH:mm:ss")));
		
	}
	
	@Test
	public void declareTest2() {
		
		//DayOfWeek
		Assert.assertEquals(DateTimeConstants.FRIDAY, new LocalDate(2015,5,1).getDayOfWeek());
		Assert.assertEquals(DateTimeConstants.SUNDAY, new LocalDate(2015,5,3).getDayOfWeek());
		Assert.assertEquals(DateTimeConstants.MONDAY, new LocalDate(2015,5,11).getDayOfWeek());
		//MonthOfYear
		Assert.assertEquals(DateTimeConstants.JANUARY, new LocalDate(2015,1,11).getMonthOfYear());
		Assert.assertEquals(DateTimeConstants.MAY, new LocalDate(2015,5,11).getMonthOfYear());
		Assert.assertEquals(DateTimeConstants.DECEMBER, new LocalDate(2015,12,11).getMonthOfYear());
		//AM、PM unknow
		//Assert.assertEquals(DateTimeConstants.AM, new LocalDateTime(2015,1,1,8,0,0));
		//Assert.assertEquals(DateTimeConstants.PM, new LocalDateTime(2015,1,1,18,0,0));
		
	}

}
