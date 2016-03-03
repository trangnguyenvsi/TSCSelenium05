package com.vsii.tsc.TSCSelenium05.quyentx.Test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	public static WebDriver driver;
	WebDriverWait wait;
	String baseURL = "http://newtours.demoaut.com";
	
	@BeforeSuite
	public void getBrowser() {
		try {
			Properties prop = new Properties();
			InputStream inputStream = new FileInputStream("./src/config.properties");
			prop.load(inputStream);

			// get the property value and decide which browser to use
			String browser = prop.getProperty("browser");
			if (browser.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./src/chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			} else if (browser.equalsIgnoreCase("opera")) {
				System.setProperty("webdriver.opera.driver", "./src/operadriver.exe");
				driver = new OperaDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			} else {
				System.out.println("No browser's found!");
			}

		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}

	@AfterSuite
	public void afterClass() {
		System.out.println("Execution finished!");
		driver.close();
	}
}
