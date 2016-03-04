package com.vsii.tsc.Selenium05.anhptq.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class FindFlight {
	
	WebDriver driver;
	
	@FindBy(name="passCount")
	WebElement passCount;
	
	@FindBy(name="tripType")
	WebElement tripType;

	@FindBy(name="fromPort")
	WebElement fromPort;

	@FindBy(name="fromMonth")
	WebElement fromMonth;

	@FindBy(name="fromDay")
	WebElement fromDay;

	@FindBy(name="toPort")
	WebElement toPort;

	@FindBy(name="toMonth")
	WebElement toMonth;

	@FindBy(name="toDay")
	WebElement toDay;
	
	@FindBy(xpath="//input[@value=\"Business\"]")
	WebElement serviceClass;
	
	@FindBy(name="airline")
	WebElement airline;
	
	@FindBy(name="findFlights")
	WebElement findFlights;
	
	public FindFlight (WebDriver driver) {
		this.driver = driver;
	}
	
	public void findFlight() {
		
		tripType.click();
	    new Select(passCount).selectByVisibleText("2");
	    new Select(fromPort).selectByVisibleText("Frankfurt");
	    new Select(fromMonth).selectByVisibleText("March");
	    new Select(fromDay).selectByVisibleText("20");
	    new Select(toPort).selectByVisibleText("New York");
	    new Select(toMonth).selectByVisibleText("April");
	    new Select(toDay).selectByVisibleText("9");
	    serviceClass.click();
	    new Select(airline).selectByVisibleText("Pangea Airlines");
	    findFlights.click();
	}
}
