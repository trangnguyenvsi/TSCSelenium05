package com.vsii.tsc.TSCSelenium05.quyentx.POM;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.vsii.tsc.TSCSelenium05.quyentx.Test.TestBase;

public class RegPOM extends TestBase {
	// Locator for Register
	private static By byRegFName = By.name("firstName");
	private static By byRegLName = By.name("lastName");
	private static By byRegPhone = By.name("phone");
	private static By byRegEmail = By.id("userName");
	private static By byRegAddress = By.name("address1");
	private static By byRegCity = By.name("city");
	private static By byRegState = By.name("state");
	private static By byRegPsCode = By.name("postalCode");
	private static By byRegCountry = By.name("country");
	private static By byRegUsername = By.id("email");
	private static By byRegPass = By.name("password");
	private static By byRegConfirmPass = By.name("confirmPassword");
	private static By byRegButton = By.name("register");
	
	//set actions
	public static void setFirstName(String strFName){
		 driver.findElement(byRegFName).sendKeys(strFName);
    }	
	public static void setLastName(String strLName){
		 driver.findElement(byRegLName).sendKeys(strLName);
   }	
	public static void setPhone(String numPhone){
		 driver.findElement(byRegPhone).sendKeys(numPhone);
	}
	public static void setMail(String strMail){
		 driver.findElement(byRegEmail).sendKeys(strMail);
	}
	public static void setAddress(String strAddr){
		 driver.findElement(byRegAddress).sendKeys(strAddr);
	}
	public static void setCity(String strCity){
		 driver.findElement(byRegCity).sendKeys(strCity);
	}
	public static void setState(String strState){
		 driver.findElement(byRegState).sendKeys(strState);
	}
	public static void setPScode(String strPsCode){
		 driver.findElement(byRegPsCode).sendKeys(strPsCode);
	}
	public static void setCountry(String strCountry){
		 driver.findElement(byRegCountry).sendKeys(strCountry);
	}
	public static void setUsername(String strUsername){
		 driver.findElement(byRegUsername).sendKeys(strUsername);
	}
	
	public static void setPass(String strPass1){
		 driver.findElement(byRegPass).sendKeys(strPass1);
	}
	public static void setPass2(String strPass2){
		 driver.findElement(byRegConfirmPass).sendKeys(strPass2);
	}
	public static void clickReg(){    	 
		 driver.findElement(byRegButton).click();
	}
	
	public static void checkRegister(String firstName, String lastName, String phone, String username, String address,
			String city, String state, String postalCode, String country, String email, String password,
			String confirmPassword) {
			setFirstName(firstName);
			setLastName(lastName);
			setPhone(phone);
			setMail(username);
			setAddress(address);
			setCity(city);
			setState(state);
			setPScode(postalCode);
			setCountry(country);
			setMail(email);
			setUsername(email);
			setPass(password);
			setPass2(confirmPassword);
			clickReg();

		Assert.assertEquals(driver.getCurrentUrl(), baseURL + "/mercuryregister.php");
	}

	
}
