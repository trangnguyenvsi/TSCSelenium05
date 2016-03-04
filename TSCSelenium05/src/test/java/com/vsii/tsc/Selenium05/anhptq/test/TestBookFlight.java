package com.vsii.tsc.TSCSelenium05.anhptq.Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vsii.tsc.TSCSelenium05.anhptq.PageFactories.Common;
import com.vsii.tsc.TSCSelenium05.anhptq.PageFactories.BookFlight;
import com.vsii.tsc.TSCSelenium05.anhptq.PageFactories.FindFlight;
import com.vsii.tsc.TSCSelenium05.anhptq.PageFactories.Login;
import com.vsii.tsc.TSCSelenium05.anhptq.PageFactories.SearchFlight;

public class TestBookFlight {

	private String username = "tutorial";
	  private String password = "tutorial";
	  
	  WebDriver driver;
	  BookFlight bookFlight;
	  FindFlight findFlight;
	  Login login;
	  SearchFlight searchFlight;
	  
	  @BeforeTest
	  public void setUp() throws Exception {
		  Common.setup();
	  }

	  @Test
	  public void testFindFlightSuccess() throws Exception {
		  bookFlight = new BookFlight(driver);
		  findFlight = new FindFlight(driver);
		  login = new Login(driver);
		  searchFlight = new SearchFlight(driver); 
		  
		  login.openHome();
		  login.login(username, password);
		  findFlight.findFlight();
		  searchFlight.selectFlight();
		  bookFlight.bookFlight();
		  Assert.assertEquals(Common.driver.getCurrentUrl(), "http://newtours.demoaut.com/mercurypurchase2.php");
	  }

	  @AfterTest
	  public void tearDown() throws Exception {
		  Common.teardown();
	  }
}
