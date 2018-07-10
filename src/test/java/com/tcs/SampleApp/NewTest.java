package com.tcs.SampleApp;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class NewTest {

    private WebDriver driver;		
    
	@Test				
	public void testEasy() throws Exception{
//		System.setProperty("webdriver.chrome.driver", "/home/turja/DevOps/chromedriver");
		ChromeOptions options = new ChromeOptions();
//		// set some options
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		dc.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new RemoteWebDriver(new URL("http://localhost:5556/wd/hub"), dc);
		System.out.println("inside test");
		
//		driver = new ChromeDriver();
		driver.get("http://127.0.01:8080/");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Home")); 		
	}	
	@BeforeTest
	public void beforeTest() {	


	}		
	@AfterTest
	public void afterTest() {
		driver.quit();	
	}		
}	

