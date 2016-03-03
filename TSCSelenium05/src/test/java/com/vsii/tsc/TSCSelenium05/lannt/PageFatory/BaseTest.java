package com.vsii.tsc.TSCSelenium05.lannt.PageFatory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BaseTest {
	public static Properties p;
	public static String baseUrl;
	public static int numberPass;	
	public static WebDriver driver;
	
	@BeforeSuite
	public void beforeClass() throws IOException {
		// Read config file
				p = Utility.readConfig();
				String browser = p.getProperty("browserName");
				baseUrl=p.getProperty("base_url");
				if (browser.equalsIgnoreCase("firefox")){
					driver = new FirefoxDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}
		
				else if (browser.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver", "D:\\LANNT\\Setup\\chromedriver_win_23.0.1240.0\\chromedriver.exe");
					driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				} else if (browser.equalsIgnoreCase("ie")) {
					System.setProperty("webdriver.ie.driver", "D:\\LANNT\\Setup\\IEDriverServer_Win32_2.52.0\\IEDriverServer.exe");
					driver = new InternetExplorerDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				}
				}
 
	@DataProvider
	public Object[][] getData1() {
		return new Object[][]{{"5", "five"}, {"6", "six"}};
	}
	
	@DataProvider
	public Object[][] getData() throws IOException{
		String[][] object = new String[4][2];
		FileInputStream fileInputStream = new FileInputStream("D:\\LANNT\\Data123.xls");
        POIFSFileSystem fsFileSystem = new POIFSFileSystem(fileInputStream);
        HSSFWorkbook workBook2 = new HSSFWorkbook(fsFileSystem);
        HSSFSheet sheet = workBook2.getSheetAt(0);
        Iterator<Row> iterator = sheet.iterator();
        int i=0;
        int j=0;
        while (iterator.hasNext()) {
        	
            Row nextRow = iterator.next();
            Iterator<Cell> cellIterator = nextRow.cellIterator();
             
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                object[i][j]=cell.getStringCellValue();
                j=j+1;
                }
            i=i+1; 
            j=0;
            }
        workBook2.close();
        return object;
	}
	
	@AfterSuite
	public void tearDown() throws Exception {
		driver.quit();
	}
}
