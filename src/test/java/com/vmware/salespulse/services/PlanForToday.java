package com.vmware.salespulse.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vmware.salespulse.test.SuiteSetupTest;

public class PlanForToday
{


	private static final Logger logger = Logger.getLogger(PlanForToday.class);
	String param2 = System.getProperty("env.OS");

	public void planForTodayverify ()
	{
		//if (param2.contains("ios"))
		if (true)
		{
			
			WebDriverWait wait = new WebDriverWait(SuiteSetupTest.driver, 60);
			
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("loading"))));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));
			logger.info("Fetching Data invisibled");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("planForToday"))));
			WebElement planForToday = CommonMethods.getElement("planForToday"); 
			planForToday.click();
	        logger.info("Plan for Today scetion head clicked");
	        
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData")))); 
			logger.info("Fetching data Invisibled");
			
			CommonMethods.testElementAssert("insightScreenHeading", "Agenda");	
			logger.info("Agenda heading asserted");
	        
		}
	}

	

}
