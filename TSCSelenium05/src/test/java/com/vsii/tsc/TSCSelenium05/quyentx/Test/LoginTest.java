package com.vsii.tsc.TSCSelenium05.quyentx.Test;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vsii.tsc.TSCSelenium05.quyentx.POM.LoginPOM;

public class LoginTest extends TestBase {
    
	@BeforeTest
    public void setup(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com");
    }
	
	
	@Test(dataProvider = "login")
	public void checkLoginInvalid(String userName, String password) {
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		if (actualTitle.contentEquals(expectedTitle)) {
			LoginPOM.loginNewTour(userName, password);
		}
		Assert.assertEquals(driver.getCurrentUrl(), baseURL + "/mercurysignon.php");
	}
	@Test
	public void checkLoginValid(){
		String expectedTitle = "Welcome: Mercury Tours";
		
		String actualTitle = driver.getTitle();
		if (actualTitle.contentEquals(expectedTitle)) {
			LoginPOM.loginNewTour("tutorial", "tutorial");
		}
		Assert.assertEquals(driver.getCurrentUrl(), baseURL + "/mercurysignon.php");
	}
	
	@AfterTest
	public void tearDown(){
		
	}
	
	@DataProvider(name = "login")
	public Object[][] loginData() {
		Object[][] arrayObject = ReadExcel.getExcelData("./src/TestData.xls", "Login");
		return arrayObject;
	}
}
