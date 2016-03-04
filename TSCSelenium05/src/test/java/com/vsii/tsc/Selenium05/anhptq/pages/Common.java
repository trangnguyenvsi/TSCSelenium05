package com.vsii.tsc.Selenium05.anhptq.pages;

import static org.junit.Assert.fail;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common {

	public static WebDriver driver = new FirefoxDriver();

	public static String baseUrl = "http://newtours.demoaut.com/";
	
	public static int rand(int min, int max) {
	      try {
	          Random rn = new Random();
	          int range = max - min + 1;
	          int randomNum = min + rn.nextInt(range);
	          return randomNum;
	      } catch (Exception e) {
	          e.printStackTrace();
	          return -1;
	      }
	  }
	
	public static boolean shouldContain (String s1, String s2) {
		if (s1.contains(s2)) {
			return true;
		}
		return false;
	}
	
	public static void setup() {
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public static void teardown () {
		Common.driver.quit();
		StringBuffer verificationErrors = new StringBuffer();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	}
}
