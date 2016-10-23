package com.vmware.salespulse.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vmware.salespulse.models.SalespulsePojo;
import com.vmware.salespulse.test.SuiteSetupTest;

public class DiscussionsScreen
{
	private static final Logger logger = Logger.getLogger(DiscussionsScreen.class);
	SalespulsePojo vPOJO = new SalespulsePojo();
	String param2 = System.getProperty("env.OS");

	public void discussionsScreenVerify()
	{
		//if (param2.contains("ios"))
		if (true)
		{
			WebDriverWait wait = new WebDriverWait(SuiteSetupTest.driver, 60);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("loading"))));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("discussionsBottomOption"))));
			WebElement discussionsBottom = CommonMethods.getElement("discussionsBottomOption");
			discussionsBottom.click();
			logger.info("Discussions Bottom clicked");

			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));
			
			CommonMethods.testElementAssert("accountHeading", "Discussions");
			logger.info("Discussions heading asserted");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("AaronBettor"))));
			
		}

	}

	public void contactofDiscussionsScreenVerify()
	{
		//if (param2.contains("ios"))
		if (true)
		{
			WebDriverWait wait = new WebDriverWait(SuiteSetupTest.driver, 60);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("loading"))));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("discussionsBottomOption"))));
			WebElement discussionsBottom = CommonMethods.getElement("discussionsBottomOption");
			discussionsBottom.click();
			logger.info("Discussions Bottom clicked");
			
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));
			
			CommonMethods.testElementAssert("accountHeading", "Discussions");
			logger.info("Discussions heading asserted");

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("AaronBettor"))));
			WebElement AaronBettorText = CommonMethods.getElement("AaronBettor");
			AaronBettorText.click();
			logger.info("Aaron Bettor Text clicked");

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("bckDiscussions"))));
			WebElement bckAccount = CommonMethods.getElement("bckDiscussions");
			bckAccount.click();
			logger.info("Back clicked");
			
			CommonMethods.testElementAssert("accountHeading", "Discussions");
			logger.info("Discussions heading asserted");

		}

	}
}
