package com.tcs.SampleApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.URL;


public class NewTest {

    private WebDriver driver;		
    
	@Test				
	public void testEasy() throws Exception{
		
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
	    
		driver.get("http://localhost:8080/");  
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

