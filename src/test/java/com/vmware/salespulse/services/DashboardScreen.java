package com.vmware.salespulse.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vmware.salespulse.models.SalespulsePojo;
import com.vmware.salespulse.test.SuiteSetupTest;




public class DashboardScreen 
{
	private static final Logger logger = Logger.getLogger(DashboardScreen.class);
	SalespulsePojo vPOJO = new SalespulsePojo();
	String param2 = System.getProperty("env.OS");
	
	public void dashboardScreenVerify ()
	{
		//if (param2.contains("ios"))
		if (true)
		{
			
			WebDriverWait wait = new WebDriverWait(SuiteSetupTest.driver, 60);
			
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("loading"))));
			logger.info("Loading invisibled");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("dashboardHeading"))));
			CommonMethods.testElementAssert("dashboardHeading", vPOJO.dashboardHeader);
			logger.info("Dashboard Header Asserted");
        
		}
	}
	
	public void dashboardScreenAssertion ()
	{
		//if (param2.contains("ios"))
		if (true)
		{
			
			WebDriverWait wait = new WebDriverWait(SuiteSetupTest.driver, 60);
			
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("loading"))));
			logger.info("Loading invisibled");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("dashboardHeading"))));
			CommonMethods.testElementAssert("dashboardHeading", vPOJO.dashboardHeader);
			logger.info("Dashboard Header Asserted");
	        
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("achieved"))));
			CommonMethods.testElementAssert(("achieved"), vPOJO.achievedText);
			logger.info("Achieved Text Asserted");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("accountNeedingAttention"))));
			CommonMethods.testElementAssert(("accountNeedingAttention"), vPOJO.accountNeedingAttentionText);
			logger.info("Account Needing Attention Text Asserted");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("supportRequest"))));
			CommonMethods.testElementAssert(("supportRequest"), vPOJO.supportRequestText);
			logger.info("Support Request Text Asserted");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("planForToday"))));
			CommonMethods.testElementAssert(("planForToday"), vPOJO.planForTodayText);
			logger.info("Plan For Today Text Asserted");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("dealsOftheWeek"))));
			CommonMethods.testElementAssert(("dealsOftheWeek"), vPOJO.dealsOftheWeekText);
			logger.info("Deals Of the Week Text Asserted");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("latestInsights"))));
			CommonMethods.testElementAssert(("latestInsights"), vPOJO.latestInsightsText);
			logger.info("Plan For Today Text Asserted");
        
		}
	}
	
}
