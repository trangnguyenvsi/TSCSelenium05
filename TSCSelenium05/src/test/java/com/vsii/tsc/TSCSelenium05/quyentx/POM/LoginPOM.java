package com.vsii.tsc.TSCSelenium05.quyentx.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.vsii.tsc.TSCSelenium05.quyentx.Test.TestBase;

public class LoginPOM extends TestBase{
    
    
	private static By byLoginName = By.name("userName");
	private static By byLoginPass = By.name("password");
	private static By byLoginButton = By.name("login");

    public void Login(WebDriver driver){
 
        TestBase.driver = driver;
 
    }
 
    //Set user name in textbox
 
    public static void setUserName(String strUserName){
 
    	TestBase.driver.findElement(byLoginName).sendKeys(strUserName);;
 
    }

    //Set password in password textbox
 
    public static void setPassword(String strPassword){
 
    	TestBase.driver.findElement(byLoginPass).sendKeys(strPassword);
 
    }
    //Click on login button
 
    public static void clickLogin(){
 
    	TestBase.driver.findElement(byLoginButton).click();
 
    }
 
 
    /**
 
     * This POM method will be exposed in test case to login in the application
 
     * @param strUserName
 
     * @param strPasword
 
     * @return
 
     */
 
    public static void loginNewTour(String strUserName,String strPasword){
 
        //Fill user name
 
        setUserName(strUserName);
 
        //Fill password
 
        setPassword(strPasword);
 
        //Click Login button
 
        clickLogin();        
 
    }
}
