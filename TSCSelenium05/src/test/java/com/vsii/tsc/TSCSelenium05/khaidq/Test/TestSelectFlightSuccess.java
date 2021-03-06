package com.vsii.tsc.TSCSelenium05.khaidq.Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vsii.tsc.TSCSelenium05.khaidq.PageFactories.Common;
import com.vsii.tsc.TSCSelenium05.khaidq.PageFactories.ModuleFind;
import com.vsii.tsc.TSCSelenium05.khaidq.PageFactories.ModuleLogin;
import com.vsii.tsc.TSCSelenium05.khaidq.PageFactories.ModuleSelect;

public class TestSelectFlightSuccess {
	  private String username = "doquangkhai";
	  private String password = "911338";
	  
	  WebDriver driver;	  
	  ModuleFind moduleFind;
	  ModuleLogin moduleLogin;
	  ModuleSelect moduleSelect;
	  
	  @BeforeTest
	  public void setUp() throws Exception {
		  Common.setup();
	  }

	  @Test
	  public void testFindFlightSuccess() throws Exception {
		  moduleFind = new ModuleFind(driver);
		  moduleLogin = new ModuleLogin(driver);
		  moduleSelect = new ModuleSelect(driver);
		  
		  moduleLogin.openHome();
		  moduleLogin.login(username, password);
		  moduleFind.findFlight();
		  moduleSelect.selectFlight();
		  Assert.assertEquals(Common.driver.getCurrentUrl(), "http://newtours.demoaut.com/mercurypurchase.php");
	  }

	  @AfterTest
	  public void tearDown() throws Exception {
		  Common.teardown();
	  }
	}
