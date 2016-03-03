package tsc.com.selenium.diuttm;


	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagePactory_diuttm.NewtourLogin;
import pagePactory_diuttm.NewtourRegister;
	
	public class TestNewTOur {
	 
	    
		WebDriver driver;
	 
	    NewtourLogin objLogin;
	 
	    NewtourRegister objRegister;
	    
   @BeforeTest
	 
	    public void setup(){
	 
	        driver = new FirefoxDriver();
	 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	        driver.get("http://newtours.demoaut.com");
	 
	    }
	 
	    @Test
	 
	    public void LoginSucc(){

	 
	    objLogin = new NewtourLogin(driver);

	    objLogin.LogintoNewtour("diuttm","123");
	    Assert.assertEquals(objLogin.getActResult(), "Welcome back to Mercury Tours! Enter your user information to access the member-only areas of this site. If you don't have a log-in, please fill out the registration form.");
	 
	    }
	    @Test
	     
        public void RegisSucc(){
	        
	        objRegister = new NewtourRegister(driver);
	        objRegister.Register("diu","tran","123456","diuttm","hanoi","hanoi","haiduong","VIETNAM","abc","123","123");
	        
	    }

     
	     
	 
	}

