package com.vsii.tsc.TSCSelenium05.khaidq.PageFactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ModuleSelect {
	
	WebDriver driver;
	
	@FindBy(xpath="(//*[@name='outFlight'])[2]")
	WebElement outFlight;
	
	@FindBy(xpath="(//*[@name='inFlight'])[3]")
	WebElement inFlight;
	
	@FindBy(name="reserveFlights")
	WebElement reserveFlights;
	
	public ModuleSelect(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void selectFlight() {
	    outFlight.click();
	    inFlight.click();
	    reserveFlights.click();

	}
}
