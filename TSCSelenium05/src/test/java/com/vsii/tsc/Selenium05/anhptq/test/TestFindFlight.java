package com.vsii.tsc.TSCSelenium05.anhptq.Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vsii.tsc.TSCSelenium05.anhptq.PageFactories.Common;
import com.vsii.tsc.TSCSelenium05.anhptq.PageFactories.FindFlight;
import com.vsii.tsc.TSCSelenium05.anhptq.PageFactories.Login;

public class TestFindFlight {
	
	private String username = "tutorial";
	  private String password = "tutorial";
	  
	  WebDriver driver;
	  
	  FindFlight findFlight;
	  Login login;
	  
	  
	  @BeforeTest
	  public void setUp() throws Exception {
		  Common.setup();
	  }

	  @Test
	  public void testFindFlightSuccess() throws Exception {
		  findFlight = new FindFlight(driver); 
		  login = new Login(driver);
		  
		  login.openHome();
		  login.login(username, password);
		  findFlight.findFlight();
		  Assert.assertEquals(Common.driver.getCurrentUrl(), "http://newtours.demoaut.com/mercuryreservation2.php");
	  }

	  @AfterTest
	  public void tearDown() throws Exception {
		  Common.teardown();
	  }
}
