package com.vsii.tsc.TSCSelenium03.tranglt.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	WebDriver driver;

	@FindBy(name = "firstName")
	WebElement firstName;

	@FindBy(name = "lastName")
	WebElement lastName;

	@FindBy(name = "phone")
	WebElement phone;

	@FindBy(id = "userName")
	WebElement userName;

	@FindBy(name = "address1")
	WebElement address1;

	@FindBy(name = "address2")
	WebElement address2;

	@FindBy(name = "city")
	WebElement city;

	@FindBy(name = "email")
	WebElement email;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(name = "confirmPassword")
	WebElement confirmPassword;

	@FindBy(name = "register")
	WebElement register;
	
	@FindBy(xpath = ".//*[contains(font,'Thank you for registering')]")
	WebElement text;

	public void Register(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	public void setfirstName(String strfirstName) {
		firstName.sendKeys(strfirstName);
	}

	public void setphone(String strphone) {
		phone.sendKeys(strphone);
	}
	
	public void setlastName(String strlastName) {
		lastName.sendKeys(strlastName);
	}
	
	public void setuserName(String struserName) {
		userName.sendKeys(struserName);
	}
	
	public void setaddress1(String straddress1) {
		address1.sendKeys(straddress1);
	}
	
	public void setaddress2(String straddress2) {
		address2.sendKeys(straddress2);
	}
	
	public void setcity(String strcity) {
		city.sendKeys(strcity);
	}
	
	public void setemail(String stremail) {
		email.sendKeys(stremail);
	}
	
	public void setpassword(String strpassword) {
		password.sendKeys(strpassword);
	}
	
	public void setconfirmPassword(String strconfirmPassword) {
		confirmPassword.sendKeys(strconfirmPassword);
	}

	public void clickRegister() {

		register.click();

	}

	public String getText() {

		return text.getText();

	}

	public void RegisterTest(String strfirstName, String strlastName,String strcity,String struserName, String strphone, String strpassword, String straddress1,String straddress2,String strconfirmPassword,String stremail) {

this.setfirstName(strfirstName);
this.setlastName(strlastName);
this.setcity(strcity);
this.setuserName(struserName);
this.setphone(strphone);
this.setpassword(strpassword);
this.setaddress1(straddress1);
this.setaddress2(straddress2);
this.setconfirmPassword(strconfirmPassword);
this.setemail(stremail);
this.clickRegister();
	}

}
