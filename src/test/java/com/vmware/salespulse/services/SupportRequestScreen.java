package com.vmware.salespulse.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vmware.salespulse.test.SuiteSetupTest;

public class SupportRequestScreen
{

	private static final Logger logger = Logger.getLogger(SupportRequestScreen.class);
	String param2 = System.getProperty("env.OS");

	public void supportRequestverify ()
	{
		//if (param2.contains("ios"))
		if (true)
		{
			
			WebDriverWait wait = new WebDriverWait(SuiteSetupTest.driver, 60);
			
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("loading"))));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));
			logger.info("Fetching Data invisibled");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("supportRequest"))));
			WebElement supportRequest = CommonMethods.getElement("supportRequest"); 
			supportRequest.click();
	        logger.info("Support Request scetion head clicked");
	        
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData")))); 
			logger.info("Fetching data Invisibled");
			
			CommonMethods.testElementAssert("opportunitiesHeading", "Support Request");	
			logger.info("Support Request heading asserted");
			
			WebElement sortButton = CommonMethods.getElement("sortButton"); 
	        logger.info("Sort button asserted");
	        
	        WebElement supportRequestBackButton = CommonMethods.getElement("supportRequestBackButton"); 
	        logger.info("Back button clicked");
			
		}
	}
}
