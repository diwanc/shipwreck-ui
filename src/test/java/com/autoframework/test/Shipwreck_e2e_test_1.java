package com.autoframework.test;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.autoframework.services.ShipWrecksHomepage;
import com.autoframework.utils.Constants;



public class Shipwreck_e2e_test_1 {
	public static WebDriver driver;
	final static Logger logger = Logger.getLogger(Shipwreck_e2e_test_1.class);
	
	@BeforeMethod
	public void beforeMethod() throws Exception { 
			driver = new FirefoxDriver();
			logger.info("New driver instantiated");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			logger.info("Implicit wait applied on the driver for 10 seconds");
			
			driver.get(Constants.ShipWreck_URL);
		    logger.info("Launched the app");
		}
	
	@Test
	public void HomePageTest() throws Exception {
		ShipWrecksHomepage._ValidateHomePage(driver);
	}

	@AfterMethod
	public void afterMethod() {
		 driver.quit();
 
        }
	
}
