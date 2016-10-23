package com.vmware.salespulse.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vmware.salespulse.test.SuiteSetupTest;

public class LatestInsights
{


	private static final Logger logger = Logger.getLogger(LatestInsights.class);
	String param2 = System.getProperty("env.OS");

	public void latestInsightVerify ()
	{
		//if (param2.contains("ios"))
		if (true)
		{
			
			WebDriverWait wait = new WebDriverWait(SuiteSetupTest.driver, 60);
			
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("loading"))));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));
			logger.info("Fetching Data invisibled");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("latestInsights"))));
			WebElement latestInsights = CommonMethods.getElement("latestInsights"); 
			latestInsights.click();
	        logger.info("Latest Insights section head clicked");
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("insightHeading"))));
			WebElement supportRequestHeading = CommonMethods.getElement("insightHeading"); 
	        logger.info("Insight heading asserted");
	        
			
		}
	}


}
