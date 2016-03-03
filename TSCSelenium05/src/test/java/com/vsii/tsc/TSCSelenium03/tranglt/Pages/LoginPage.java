package com.vsii.tsc.TSCSelenium03.tranglt.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	 
    By userName = By.name("userName");

	By password = By.name("password");
 
    By loginbutt =By.name("login");
 
    public void Login(WebDriver driver){
    	 
        this.driver = driver;
 
    }
 
    public void setUserName(String strUserName){
 
        driver.findElement(userName).sendKeys(strUserName);
 
    }
 
    public void setPassword(String strPassword){
 
         driver.findElement(password).sendKeys(strPassword);
 
    }
 
    public void clickLogin(){
 
            driver.findElement(loginbutt).click();
 
    }
 

    
}
