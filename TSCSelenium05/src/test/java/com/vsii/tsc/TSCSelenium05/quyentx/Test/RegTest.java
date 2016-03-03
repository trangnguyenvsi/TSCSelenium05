package com.vsii.tsc.TSCSelenium05.quyentx.Test;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.vsii.tsc.TSCSelenium05.quyentx.POM.RegPOM;

public class RegTest extends TestBase{
	
	@BeforeTest
    public void setup(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
	
	
	@Test(dataProvider = "register")
	public void checkRegInvalid(String firstName, String lastName, String phone, String username, String address,
			String city, String state, String postalCode, String country, String email, String password,
			String confirmPassword) {
		String expectedTitle = "Register: Mercury Tours";
		String actualTitle = "";
		actualTitle = driver.getTitle();
		if (actualTitle.contentEquals(expectedTitle)) {
			RegPOM.checkRegister(firstName, lastName, phone, username, address,
					city, state, postalCode, country, email, password, confirmPassword);
		}
		Assert.assertEquals(driver.getCurrentUrl(), baseURL + "/mercuryregister.php");
	}
	@Test
	public void checkRegisterValid() {

		String expectedTitle = "Register: Mercury Tours";
		String actualTitle = "";
		driver.get(baseURL + "/mercuryregister.php");
		actualTitle = driver.getTitle();

		if (actualTitle.contentEquals(expectedTitle)) {
			RegPOM.checkRegister("Quyen", "Ta", "0987654321", "test@gmail.com", "123 Lincold Street",
					"NewYork", "New Jersey","700123", "United States", "quyentx", "password1", "password1");
		}
		Assert.assertEquals(driver.getCurrentUrl(), baseURL + "/create_account_success.php");
	}
	
	@AfterTest
	public void tearDown(){
		
	}
	
	@DataProvider(name = "register")
	public Object[][] loginData() {
		Object[][] arrayObject = ReadExcel.getExcelData("./src/TestData.xls", "Register");
		return arrayObject;
	}
}
