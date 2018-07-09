package com.tcs.SampleApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {

    private WebDriver driver;		
	@Test				
	public void testEasy() {	
		driver.get("http://localhost:8080/");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Home")); 		
	}	
	@BeforeTest
	public void beforeTest() {	
		
	    driver = new ChromeDriver();  
	}		
	@AfterTest
	public void afterTest() {
		driver.quit();			
	}		
}	

