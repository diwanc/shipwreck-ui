package com.vmware.salespulse.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vmware.salespulse.models.SalespulsePojo;
import com.vmware.salespulse.test.SuiteSetupTest;

public class PipelineView
{
	private static final Logger logger = Logger.getLogger(PipelineView.class);
	String param2 = System.getProperty("env.OS");

	public void pipelineViewVerify ()
	{
		//if (param2.contains("ios"))
		if (true)
		{
			
			WebDriverWait wait = new WebDriverWait(SuiteSetupTest.driver, 60);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("loading"))));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));
		
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("pipeline"))));
			WebElement pipeline = CommonMethods.getElement("pipeline"); 
			pipeline.click();
	        logger.info("Pipeline View clicked");
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("pipelienViewHeading"))));
			WebElement pipelineView = CommonMethods.getElement("pipelienViewHeading"); 
	        logger.info("Pipeline View heading asserted");
	        
			WebElement opportunitiesTab = CommonMethods.getElement("opportunitiesTab"); 
			opportunitiesTab.click();
	        logger.info("Opportunities tab clicked");
	        
	        WebElement performanceTab = CommonMethods.getElement("performanceTab"); 
	        performanceTab.click();
	        logger.info("Performance tab clicked");
	        
	        WebElement pipelineViewBackbutton = CommonMethods.getElement("pipelineViewBackbutton"); 
	        pipelineViewBackbutton.click();
	        logger.info("back button clicked clicked");
		}
	}
}
