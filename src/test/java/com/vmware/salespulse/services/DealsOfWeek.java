package com.vmware.salespulse.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vmware.salespulse.test.SuiteSetupTest;

public class DealsOfWeek
{


	private static final Logger logger = Logger.getLogger(DealsOfWeek.class);
	String param2 = System.getProperty("env.OS");

	public void dealsOfWeekVerify ()
	{
		//if (param2.contains("ios"))
		if (true)
		{
			
			WebDriverWait wait = new WebDriverWait(SuiteSetupTest.driver, 60);
			
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("loading"))));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));
			logger.info("Fetching Data invisibled");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("dealsOftheWeek"))));
			WebElement dealsOftheWeek = CommonMethods.getElement("dealsOftheWeek"); 
			dealsOftheWeek.click();
	        logger.info("Deals of the Week section head clicked");
	        
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData")))); 
			logger.info("Fetching data Invisibled");
			
			CommonMethods.testElementAssert("opportunitiesHeading", "Opportunity");	
			logger.info("Opportunity heading asserted");
			
		}
	}




}
