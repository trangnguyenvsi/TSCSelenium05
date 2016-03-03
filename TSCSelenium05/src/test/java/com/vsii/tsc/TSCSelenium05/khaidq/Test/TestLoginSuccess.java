package com.vsii.tsc.TSCSelenium05.khaidq.Test;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vsii.tsc.TSCSelenium05.khaidq.PageFactories.Common;
import com.vsii.tsc.TSCSelenium05.khaidq.PageFactories.ModuleLogin;

public class TestLoginSuccess {
	  private String username = "doquangkhai";
	  private String password = "911338";
	  
	  WebDriver driver;
	  
	  ModuleLogin moduleLogin;
	  
	  @BeforeTest
	  public void setUp() throws Exception {
		  Common.setup();
	  }

	  @Test
	  public void testLoginSuccess() throws Exception {
		  moduleLogin = new ModuleLogin(driver);
		  
		  moduleLogin.openHome();
		  moduleLogin.login(username, password);
		  Assert.assertTrue(Common.shouldContain(Common.driver.getCurrentUrl(), "http://newtours.demoaut.com/mercuryreservation.php"));
	  }

	  @AfterTest
	  public void tearDown() throws Exception {
		  Common.teardown();
	  }
	}
