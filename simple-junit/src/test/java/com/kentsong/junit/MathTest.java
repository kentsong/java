package com.kentsong.junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public class MathTest {

  private Math math = new Math();

	@Test
	public void testAssertNotNull() {
		Assert.assertNotNull("should not be null", math);
	}

	@Test
	public void testSum() {
		Assert.assertTrue("failure - not equal", math.sum(3, 2) == 5);
		
	}

	@Test
	public void testMultiply() {
		Assert.assertTrue("failure - not equal", math.multiply(3, 2) == 6);
	}

	@Test
	public void testDivide() {
		double x = 3, y = 2;
		
		Assert.assertTrue("failure - not equal", math.divide(x, y) == 1.5);
	}

	@Test
	public void testSubtract() {
		Assert.assertTrue("failure - not equal", math.subtract(3, 2) == 1);
	}

}