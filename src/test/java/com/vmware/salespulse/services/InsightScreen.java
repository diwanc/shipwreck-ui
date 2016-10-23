package com.vmware.salespulse.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vmware.salespulse.models.SalespulsePojo;
import com.vmware.salespulse.test.SuiteSetupTest;

public class InsightScreen
{
	private static final Logger logger = Logger.getLogger(InsightScreen.class);
	SalespulsePojo vPOJO = new SalespulsePojo();
	String param2 = System.getProperty("env.OS");
	
	public void insightScreenVerify ()
	{
		//if (param2.contains("ios"))
		if (true)
		{
			
			WebDriverWait wait = new WebDriverWait(SuiteSetupTest.driver, 60);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("loading"))));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));
			logger.info("Fetching Data invisibled");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("insightBottomOption"))));
	        WebElement insightBottom = CommonMethods.getElement("insightBottomOption"); 
	        insightBottom.click();
	        logger.info("Insight Bottom clicked");
			
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));
			logger.info("Fetching Data invisibled");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("insightHeading"))));
	        WebElement customizeDashboard = CommonMethods.getElement("insightHeading"); 
	        logger.info("Insight Heading asserted");  
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("dashboardBottom"))));
			WebElement dashboardBottom = CommonMethods.getElement("dashboardBottom"); 
			dashboardBottom.click();
	        logger.info("Dashboard Bottom clicked");
	        
			
		}
	}
	
	public void vmwareTabInsightsScreen()
	{
		//if (param2.contains("ios"))
		if (true)
		{
			
			WebDriverWait wait = new WebDriverWait(SuiteSetupTest.driver, 60);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("loading"))));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));
			logger.info("Fetching Data invisibled");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("insightBottomOption"))));
	        WebElement insightBottom = CommonMethods.getElement("insightBottomOption"); 
	        insightBottom.click();
	        logger.info("Insight Bottom clicked");
			
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));
			logger.info("Fetching Data invisibled");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("insightHeading"))));
	        WebElement customizeDashboard = CommonMethods.getElement("insightHeading"); 
	        logger.info("Insight Heading asserted");
			
	        WebElement VMWare = CommonMethods.getElement("VMWareTab"); 
	        VMWare.click();
	        logger.info("VMWare tab clicked");
	        
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));
			logger.info("fetchingData  invisibled");
			
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("AccountTab"))));
	        WebElement Account = CommonMethods.getElement("AccountTab"); 
	        Account.click();
	        logger.info("Account tab clicked");	        
			
		}
	}
}
