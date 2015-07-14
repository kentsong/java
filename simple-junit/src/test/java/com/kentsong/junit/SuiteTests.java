package com.kentsong.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BasicTest.class, 
				ExceptionTest.class 
})
public class SuiteTests {

}
