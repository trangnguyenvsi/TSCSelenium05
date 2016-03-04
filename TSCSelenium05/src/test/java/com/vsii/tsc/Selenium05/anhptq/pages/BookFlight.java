package com.vsii.tsc.Selenium05.anhptq.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



import org.openqa.selenium.support.FindBy;

public class BookFlight {
	WebDriver driver;
	
	@FindBy(name="passFirst0")
	WebElement firstName1;
	
	@FindBy(name="passLast0")
	WebElement lastName1;
	
	@FindBy(name="pass.0.meal")
	WebElement meal1;
	
	@FindBy(name="passFirst1")
	WebElement firstName2;
	
	@FindBy(name="passLast1")
	WebElement lastName2;
	
	@FindBy(name="pass.1.meal")
	WebElement meal2;
	
	@FindBy(name="creditnumber")
	WebElement creditNumber;
	
	@FindBy(name="cc_exp_dt_mn")
	WebElement ccExpMonth;
	
	@FindBy(name="cc_exp_dt_yr")
	WebElement ccExpYear;
	
	@FindBy(name="cc_frst_name")
	WebElement ccFirstName;
	
	@FindBy(name="cc_mid_name")
	WebElement ccMidName;
	
	@FindBy(name="cc_last_name")
	WebElement ccLastName;
	
	@FindBy(name="ticketLess")
	WebElement ticketLess1;
	
	@FindBy(name="billAddress1")
	WebElement billAddress1;
	
	@FindBy(name="billAddress2")
	WebElement billAddress2;
	
	@FindBy(name="billCity")
	WebElement billCity;
	
	@FindBy(name="billState")
	WebElement billState;
	
	@FindBy(name="billZip")
	WebElement billZip;
	
	@FindBy(name="billCountry")
	WebElement billCountry;
	
	@FindBy(xpath="(//*[@name='ticketLess'])[1]")
	WebElement ticketLess2;
	
	@FindBy(name="delAddress1")
	WebElement delAddress1;
	
	@FindBy(name="delAddress2")
	WebElement delAddress2;
	
	@FindBy(name="delCity")
	WebElement delCity;
	
	@FindBy(name="delState")
	WebElement delState;
	
	@FindBy(name="delZip")
	WebElement delZip;
	
	@FindBy(name="delCountry")
	WebElement delCountry;
	
	@FindBy(name="buyFlights")
	WebElement buyFlights;
	
	public BookFlight (WebDriver driver) {
		this.driver = driver;
	}
	
	public void bookFlight() {
		firstName1.sendKeys("Quang Khai");
		lastName1.sendKeys("Do");
	    new Select(meal1).selectByVisibleText("Low Calorie");
	    firstName1.sendKeys("Gau cua Khai");
		lastName1.sendKeys("Nguyen");
	    new Select(meal2).selectByVisibleText("Low Cholesterol");
	    creditNumber.sendKeys("1122334455");
	    new Select(ccExpMonth).selectByVisibleText("04");
	    new Select(ccExpYear).selectByVisibleText("2009");
	    ccFirstName.sendKeys("Khai");
	    ccMidName.sendKeys("Quang");
	    ccLastName.sendKeys("Do");
	    ticketLess1.click();
	    billAddress1.sendKeys("Ha Noi");
	    billAddress2.sendKeys("Ha Noi");
	    billCity.sendKeys("Ha Noi");
	    billState.sendKeys("Ha Noi");
	    billZip.sendKeys("Ha Noi");
	    new Select(billCountry).selectByVisibleText("VIETNAM");
	    ticketLess2.click();
	    
	    delAddress1.sendKeys("Ha Noi");
	    delAddress2.sendKeys("Ha Noi");
	    delCity.sendKeys("Ha Noi");
	    delState.sendKeys("Ha Noi");
	    delZip.sendKeys("Ha Noi");
	    new Select(delCountry).selectByVisibleText("TOKELAU");
	    Alert alert = Common.driver.switchTo().alert();
	    alert.accept();
	    buyFlights.click();

	}
}
