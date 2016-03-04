package com.vsii.tsc.TSCSelenium05.anhptq.Test;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vsii.tsc.TSCSelenium05.anhptq.PageFactories.Common;
import com.vsii.tsc.TSCSelenium05.anhptq.PageFactories.Login;
import com.vsii.tsc.TSCSelenium05.anhptq.PageFactories.Register;
import com.vsii.tsc.TSCSelenium05.khaidq.PageFactories.ModuleLogin;
import com.vsii.tsc.TSCSelenium05.khaidq.PageFactories.ModuleReg;

public class TestRegister {

	//Create username
	  private String username = "anhptq"+ Common.rand(10000, 99999);
	  private String password = "123456";
	  private String confirmPassword = "123456";
	  private String confirmPasswrong = "123456";
	  
	  WebDriver driver;
	  
	  Login login;
	  Register Reg;
	  
	  @BeforeTest
	  public void setUp() throws Exception {
		  Common.setup();
	  }

	  @Test
	  public void testRegSuccess() throws Exception {
		  login = new Login(driver);
		  Reg = new Register(driver);
		  
		  Reg.openRegister();
		  Reg.register(username, password, confirmPassword);
		  login.openHome();
		  login.login(username, password);
		  Assert.assertTrue(Common.shouldContain(Common.driver.getCurrentUrl(), "http://newtours.demoaut.com/mercuryreservation.php"));
	  }

	  public void testRegUnsuccess() throws Exception {
		  login = new Login(driver);
		  Reg = new Register(driver);
		  
		  Reg.openRegister();
		  Reg.register(username, password, confirmPasswrong);
		  login.openHome();
		  login.login(username, password);
		  Assert.assertTrue(Common.shouldContain(Common.driver.getCurrentUrl(), "http://newtours.demoaut.com/mercurysignon.php"));
	  }
	  
	  @AfterTest
	  public void tearDown() throws Exception {
		  Common.teardown();
	  }
}
