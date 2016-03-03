package com.vsii.tsc.TSCSelenium05.lannt.test;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.vsii.tsc.TSCSelenium05.lannt.PageFatory.BaseTest;
import com.vsii.tsc.TSCSelenium05.lannt.PageFatory.Login;


public class LoginNewTours {
	 WebDriver driver;	 
     Login objLogin;
     BaseTest objBaseTest;
    
    @BeforeTest 
    public void setup(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://newtours.demoaut.com/"); 
    }
    
//    @Test(dataProvider="getData",dataProviderClass=BaseTest.class)
	public void loginTest(String strUserName,String strPasword) throws Exception {
    	objLogin = new Login(driver); 
    	objLogin.login(strUserName,strPasword);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Assert.assertTrue(objLogin.getTextLoginPass().contains("Use our Flight Finder to search for the lowest fare on participating airlines. Once you've booked your flight, don't forget to visit the Mercury Tours Hotel Finder to reserve lodging in your destination city."));
    }
    /*
     * This test go to http://newtours.demoaut.com/
     * Verify Login successfully
     */
    @Test(priority=0) 
    public void testLoginSucc(){
    	//Create Login Page object
    	objLogin = new Login(driver); 
    	objLogin.login("tutorial", "tutorial");
    	Assert.assertTrue(objLogin.getTextLoginPass().contains("Use our Flight Finder to search for the lowest fare on participating airlines. Once you've booked your flight, don't forget to visit the Mercury Tours Hotel Finder to reserve lodging in your destination city."));

    }	
//    @Test(priority=1) 
    public void testLoginFail(){
    	
    	//Create Login Page object
    	objLogin = new Login(driver); 
    	objLogin.login("bla", "");
    	Assert.assertTrue(objLogin.getTextLoginFail().contains("Welcome back to Mercury Tours! Enter your user information to access the member-only areas of this site. If you don't have a log-in, please fill out the registration form."));
    }	
    @AfterTest
    public void tearDown() throws Exception {
		driver.quit();    
    }
}
