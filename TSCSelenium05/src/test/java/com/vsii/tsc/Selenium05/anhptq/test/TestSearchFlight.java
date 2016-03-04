package com.vsii.tsc.Selenium05.anhptq.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vsii.tsc.Selenium05.anhptq.pages.Common;
import com.vsii.tsc.Selenium05.anhptq.pages.FindFlight;
import com.vsii.tsc.Selenium05.anhptq.pages.Login;
import com.vsii.tsc.Selenium05.anhptq.pages.SearchFlight;



public class TestSearchFlight {

	private String username = "tutorial";
	  private String password = "tutorial";
	  
	  WebDriver driver;	  
	  FindFlight findFlight;
	  Login login;
	  SearchFlight searchFlight;
	  
	  @BeforeTest
	  public void setUp() throws Exception {
		  Common.setup();
	  }

	  @Test
	  public void testFindFlightSuccess() throws Exception {
		  findFlight = new FindFlight(driver);
		  login = new Login(driver);
		  searchFlight = new SearchFlight(driver);
		  
		  login.openHome();
		  login.login(username, password);
		  findFlight.findFlight();
		  searchFlight.selectFlight();
		  Assert.assertEquals(Common.driver.getCurrentUrl(), "http://newtours.demoaut.com/mercurypurchase.php");
	  }

	  @AfterTest
	  public void tearDown() throws Exception {
		  Common.teardown();
	  }
}
