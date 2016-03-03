package com.vsii.tsc.TSCSelenium05.khaidq.Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vsii.tsc.TSCSelenium05.khaidq.PageFactories.Common;
import com.vsii.tsc.TSCSelenium05.khaidq.PageFactories.ModuleLogin;
import com.vsii.tsc.TSCSelenium05.khaidq.PageFactories.ModuleReg;

public class TestRegUnsuccess {
	  //Create username
	  private String username = "test"+ Common.rand(10000, 99999);
	  private String password = "123123";
	  private String confirmPassword = "123";
	  
	  WebDriver driver;
	  
	  ModuleLogin moduleLogin;
	  ModuleReg moduleReg;
	  
	  @BeforeTest
	  public void setUp() throws Exception {
		  Common.setup();
	  }

	  @Test
	  public void testRegUnsuccess() throws Exception {
		  moduleLogin = new ModuleLogin(driver);
		  moduleReg = new ModuleReg(driver);
		  
		  moduleReg.openRegister();
		  moduleReg.register(username, password, confirmPassword);
		  moduleLogin.openHome();
		  moduleLogin.login(username, password);
		  Assert.assertTrue(Common.shouldContain(Common.driver.getCurrentUrl(), "http://newtours.demoaut.com/mercurysignon.php"));
	  }

	  @AfterTest
	  public void tearDown() throws Exception {
		  Common.teardown();
	  }
	}
