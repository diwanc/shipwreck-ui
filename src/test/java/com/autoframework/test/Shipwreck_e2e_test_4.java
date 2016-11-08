package com.autoframework.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.autoframework.services.AddNewShipwrecksPage;
import com.autoframework.services.ShipWrecksHomepage;
import com.autoframework.services.ShipwrecksListPage;
import com.autoframework.services.ViewShipwrecksDetailPage;
import com.autoframework.services.ViewShipwrecksPage;
import com.autoframework.utils.Constants;



public class Shipwreck_e2e_test_4 {
	public static WebDriver driver;
	final static Logger logger = Logger.getLogger(Shipwreck_e2e_test_4.class);
	
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
	public void ViewShipWreckTest() throws Exception {
		ShipWrecksHomepage._NavigateShipwrecksPage(driver);
		ViewShipwrecksPage._ViewShipwreckDetail_ByName(driver, Constants.ViewNewShipwreck_Name);
		
		AssertJUnit.assertEquals(ViewShipwrecksDetailPage._ValidateShipwreckDetailPage_ByProp(driver,Constants.AddNewShipwreck_Name).contains(Constants.ViewNewShipwreck_Name), true);
		logger.info("checked for name"); 
		
		AssertJUnit.assertEquals(ViewShipwrecksDetailPage._ValidateShipwreckDetailPage_ByProp(driver,Constants.AddNewShipwreck_Description).contains(Constants.ViewNewShipwreck_Description), true);
		logger.info("checked for description"); 
	
		AssertJUnit.assertEquals(ViewShipwrecksDetailPage._ValidateShipwreckDetailPage_ByProp(driver,Constants.AddNewShipwreck_Condition).contains(Constants.ViewNewShipwreck_Condition), true);
		logger.info("checked for condition");
		
		
		AssertJUnit.assertEquals(ViewShipwrecksDetailPage._ValidateShipwreckDetailPage_ByProp(driver,Constants.AddNewShipwreck_DepthOfWreck).contains(Constants.ViewNewShipwreck_DepthOfWreck), true);
		logger.info("checked for depth");
		
		AssertJUnit.assertEquals(ViewShipwrecksDetailPage._ValidateShipwreckDetailPage_ByProp(driver,Constants.AddNewShipwreck_YearDiscovered).contains(Constants.ViewNewShipwreck_YearDiscovered), true);
		
		AssertJUnit.assertEquals(ViewShipwrecksDetailPage._ValidateShipwreckDetailPage_ByProp(driver,Constants.AddNewShipwreck_Latitude).contains(Constants.ViewNewShipwreck_Latitude), true);
		AssertJUnit.assertEquals(ViewShipwrecksDetailPage._ValidateShipwreckDetailPage_ByProp(driver,Constants.AddNewShipwreck_Longitude).contains(Constants.ViewNewShipwreck_Longitude), true);
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
 
        }
	
}
