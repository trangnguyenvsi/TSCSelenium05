package com.vsii.tsc.TSCSelenium05.khaidq.Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vsii.tsc.TSCSelenium05.khaidq.PageFactories.Common;
import com.vsii.tsc.TSCSelenium05.khaidq.PageFactories.ModuleFind;
import com.vsii.tsc.TSCSelenium05.khaidq.PageFactories.ModuleLogin;

public class TestFindFlightSuccess {
	  private String username = "doquangkhai";
	  private String password = "911338";
	  
	  WebDriver driver;
	  
	  ModuleFind moduleFind;
	  ModuleLogin moduleLogin;
	  
	  
	  @BeforeTest
	  public void setUp() throws Exception {
		  Common.setup();
	  }

	  @Test
	  public void testFindFlightSuccess() throws Exception {
		  moduleFind = new ModuleFind(driver); 
		  moduleLogin = new ModuleLogin(driver);
		  
		  moduleLogin.openHome();
		  moduleLogin.login(username, password);
		  moduleFind.findFlight();
		  Assert.assertEquals(Common.driver.getCurrentUrl(), "http://newtours.demoaut.com/mercuryreservation2.php");
	  }

	  @AfterTest
	  public void tearDown() throws Exception {
		  Common.teardown();
	  }
	}
