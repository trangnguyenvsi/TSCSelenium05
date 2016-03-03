package com.vsii.tsc.TSCSelenium05.khaidq.PageFactories;

import com.vsii.tsc.TSCSelenium05.khaidq.PageFactories.Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ModuleLogin {
	
	WebDriver driver;
	
	@FindBy(name="userName")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="login")
	WebElement login;
	
	public ModuleLogin (WebDriver driver) {
		this.driver = driver;
	}
	
	public void login (String u, String p) {
	    userName.sendKeys(u);
	    password.sendKeys(p);
	    login.click();
	}
	
	public void openHome () {
		Common.driver.get(Common.baseUrl + "/mercurywelcome.php");
	}
}
