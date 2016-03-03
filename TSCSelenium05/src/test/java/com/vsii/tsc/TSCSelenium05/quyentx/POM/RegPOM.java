package com.vsii.tsc.TSCSelenium05.quyentx.POM;

import org.openqa.selenium.By;

import com.vsii.tsc.TSCSelenium05.quyentx.Test.TestBase;

public class RegPOM extends TestBase {
	// Locator for Register
	private static By byRegFName = By.name("firstName");
	private static By byRegLName = By.name("lastName");
	private static By byRegPhone = By.name("phone");
	private By byRegEmail = By.id("userName");
	private By byRegAddress = By.name("address1");
	private By byRegCity = By.name("city");
	private By byRegState = By.name("state");
	private By byRegPsCode = By.name("postalCode");
	private By byRegCountry = By.name("country");
	private By byRegUsername = By.id("email");
	private By byRegPass = By.name("password");
	private By byRegConfirmPass = By.name("confirmPassword");
	private By byRegButton = By.name("register");
	
	public static void setFirstName(String strFName){
		 driver.findElement(byRegFName).sendKeys(strFName);;
    }
	
	public static void setLastName(String strLName){
		 driver.findElement(byRegLName).sendKeys(strLName);;
   }
	
	public static void setPhone(String numPhone){
		 driver.findElement(byRegPhone).sendKeys(numPhone);;
  }
	
	public static void setPhone(String numPhone){
		 driver.findElement(byRegPhone).sendKeys(numPhone);;
 }
	
}
