package com.vsii.tsc.TSCSelenium05.lannt.PageFatory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
//import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

public class Login {
	/**
	 
     * All WebElements are identified by @FindBy annotation
 
     */
 
    WebDriver driver;   
    
    @FindBy(name="userName")
    WebElement UserName;
    
    @FindBy(name="password")
    WebElement Password;

    @FindBy(name="login")
    WebElement Signin;
    
    @FindBy(xpath=".//*[contains(text(),'Enter your user information to access')]")
    WebElement TextLoginFail;
    
    @FindBy(xpath=".//*[contains(text(),'Use our Flight Finder')]")
    WebElement TextLoginPass;
    
    public Login(WebDriver driver){
    this.driver = driver;
 
        //This initElements method will create all WebElements
 
        PageFactory.initElements(driver, this);
 
    }
 
    //Set user name in textbox
 
    public void setUserName(String strUserName){
 
        UserName.sendKeys(strUserName);        
 
    }     
 
    //Set password in password textbox
 
    public void setPassword(String strPassword){
    	Password.sendKeys(strPassword);
    }
  
    //Click on login button
 
    public void clickLogin(){
            Signin.click();
 
    }
    
    //Get textLoginFail
 
    public String getTextLoginFail(){
     return    TextLoginFail.getText();
 
    }
 
   //Get textLoginPass
    
    public String getTextLoginPass(){
     return    TextLoginPass.getText();
 
    }
    /**
 
     * This POM method will be exposed in test case to login in the application
 
     * @param strUserName
 
     * @param strPasword
 
     * @return
 
     */
 
    public void login(String strUserName,String strPasword){
 
        //Fill user name
        this.setUserName(strUserName);
 
        //Fill password 
        this.setPassword(strPasword);
 
        //Click Login button
        this.clickLogin();                  
    }	
  
//    public void flightFinder(){
//    	login("lannt01", "12345");
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(".//*[@type='radio' and @value='oneway']")).click();
//		new Select(driver.findElement(By.name("passCount"))).selectByVisibleText("3");
//		numberPass = Integer.parseInt(driver.findElement(By.name("passCount")).getAttribute("value"));
//		setNumberPass(numberPass-1);
//		new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("London");
//		new Select(driver.findElement(By.name("fromMonth"))).selectByVisibleText("March");
//		new Select(driver.findElement(By.name("fromDay"))).selectByVisibleText("10");
//		new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("New York");
//		new Select(driver.findElement(By.name("toMonth"))).selectByVisibleText("March");
//		new Select(driver.findElement(By.name("toDay"))).selectByVisibleText("20");
//		driver.findElement(By.xpath(".//*[@type='radio' and @value='First']")).click();
//		new Select(driver.findElement(By.name("airline"))).selectByVisibleText("Blue Skies Airlines");
//		driver.findElement(By.name("findFlights")).click();	
//}
    
//    @FindBy(xpath=".//*[@type='radio' and @value='oneway']")
//    WebElement Type;

}
    
 
     
    
    

