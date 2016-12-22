package com.kent.utils.math;
import java.math.BigDecimal;

public class DecimalPointCalculator {

	public static void main(String[] args) {

		Double price = 10.8455D;
		
		//無條件捨去
		System.out.println("org price = "+ price + ", 無條件捨去 = " +new BigDecimal(price).setScale(0, BigDecimal.ROUND_DOWN).longValue());
		System.out.println("org price = "+ price + ", 無條件捨去小數點第1位 = " +new BigDecimal(price).setScale(1, BigDecimal.ROUND_DOWN).doubleValue());
		System.out.println("org price = "+ price + ", 無條件捨去小數點第2位 = " +new BigDecimal(price).setScale(2, BigDecimal.ROUND_DOWN).doubleValue());
		
		System.out.println("----------------------------------------------------");
		
		//四捨五入
		System.out.println("org price = "+ price + ", 四捨五入 = " +new BigDecimal(price).setScale(0, BigDecimal.ROUND_HALF_UP).longValue());
		System.out.println("org price = "+ price + ", 四捨五入小數點第1位 = " +new BigDecimal(price).setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue());
		System.out.println("org price = "+ price + ", 四捨五入小數點第2位 = " +new BigDecimal(price).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
    }
}
