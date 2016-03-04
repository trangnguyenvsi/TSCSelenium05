package com.vsii.tsc.Selenium05.anhptq.pages;

import com.vsii.tsc.TSCSelenium05.anhptq.PageFactories.Common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register {
	WebDriver driver;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="confirmPassword")
	WebElement confirmPassword;
	
	@FindBy(name="register")
	WebElement register;
	
	public Register (WebDriver driver) {
		this.driver = driver;
	}
	
	public void register(String u, String p, String cp) {
		Common.driver.findElement(By.id("email")).sendKeys(u);
		Common.driver.findElement(By.name("password")).sendKeys(p);
		Common.driver.findElement(By.name("confirmPassword")).sendKeys(cp);
		Common.driver.findElement(By.name("register")).click();
	}
	
	public void openRegister() {
		Common.driver.get(Common.baseUrl + "/mercuryregister.php");
	}
}
