package com.vsii.tsc.Selenium05.anhptq.test;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vsii.tsc.Selenium05.anhptq.pages.Common;
import com.vsii.tsc.Selenium05.anhptq.pages.Login;

public class TestLogin {
	private String username1 = "tutorial";
	 private String password1 = "tutorial";
	 private String username2 = "tutorial";
	private String wrongPass = "123456";
	  WebDriver driver;
	  
	  Login login;
	  
	  @BeforeTest
	  public void setUp() throws Exception {
		  Common.setup();
	  }

	  @Test
	  public void testLoginSuccess() throws Exception {
		  login = new Login(driver);
		  
		  login.openHome();
		  login.login(username1, password1);
		  Assert.assertTrue(Common.shouldContain(Common.driver.getCurrentUrl(), "http://newtours.demoaut.com/mercuryreservation.php"));
	  }

	  public void testLoginUnuccess() throws Exception {
		  login = new Login(driver);
			
		  login.openHome();
		  login.login(username2, wrongPass);
			Assert.assertTrue(Common.shouldContain(Common.driver.getCurrentUrl(), "http://newtours.demoaut.com/mercurysignon.php"));
		  }
	  
	  @AfterTest
	  public void tearDown() throws Exception {
		  Common.teardown();
	  }
}
