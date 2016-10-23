package com.vmware.salespulse.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vmware.salespulse.models.SalespulsePojo;
import com.vmware.salespulse.test.SuiteSetupTest;

public class AccountScreen 
{
	private static final Logger logger = Logger.getLogger(AccountScreen.class);
	SalespulsePojo vPOJO = new SalespulsePojo();
	String param2 = System.getProperty("env.OS");
	
	public void accountScreenVerify ()
	{
		//if (param2.contains("ios"))
		if (true)
		{
			
			WebDriverWait wait = new WebDriverWait(SuiteSetupTest.driver, 60);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("loading"))));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("accountsBottomOption"))));
	        WebElement accountsBottom = CommonMethods.getElement("accountsBottomOption"); 
	        accountsBottom.click();
	        logger.info("Accounts Bottom clicked");
	        
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));
			logger.info("Fetching Data invisibled");
			
	        CommonMethods.testElementAssert("accountHeading", "Accounts");	
			logger.info("Accounts heading asserted");

		}
	}
	
	public void searchAccountVerify ()
	{
		//if (param2.contains("ios"))
		if (true)
		{
			
			WebDriverWait wait = new WebDriverWait(SuiteSetupTest.driver, 60);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("loading"))));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("accountsBottomOption"))));
	        WebElement accountsBottom = CommonMethods.getElement("accountsBottomOption"); 
	        accountsBottom.click();
	        logger.info("Accounts Bottom clicked");
	        
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));
			logger.info("Fetching Data invisibled");
			
			CommonMethods.testElementAssert("accountHeading", "Accounts");	
			logger.info("Accounts heading asserted");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("SearchText"))));
	        WebElement VMWare = CommonMethods.getElement("SearchText"); 
	        VMWare.sendKeys("Discovery Natural");
	        logger.info("Discovery Natural searched");
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("DiscoveryNaturalClick"))));
	        WebElement DiscoveryNatural = CommonMethods.getElement("DiscoveryNaturalClick"); 
	        logger.info("Discovery Natural account verified");
	        
		}
	}
	
	
	public void accountDetailsScreenVerify ()
	{
		//if (param2.contains("ios"))
		if (true)
		{
			
			WebDriverWait wait = new WebDriverWait(SuiteSetupTest.driver, 60);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("loading"))));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("accountsBottomOption"))));
	        WebElement accountsBottom = CommonMethods.getElement("accountsBottomOption"); 
	        accountsBottom.click();
	        logger.info("Accounts Bottom clicked");
	        
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));
			logger.info("Fetching Data invisibled");
			
			CommonMethods.testElementAssert("accountHeading", "Accounts");	
			logger.info("Accounts heading asserted");

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("SearchText"))));
	        WebElement VMWare = CommonMethods.getElement("SearchText"); 
	        VMWare.sendKeys("Discovery Natural");
	        logger.info("Discovery Natural searched");
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("DiscoveryNaturalClick"))));
	        WebElement DiscoveryNatural = CommonMethods.getElement("DiscoveryNaturalClick"); 
	        DiscoveryNatural.click();
	        logger.info("Discovery Natural row clicked");
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("accountTitle"))));
	        CommonMethods.testElementAssert("accountTitle", "Discovery Natural Resources"); 
	        logger.info("Discovery Natural title asserted");
	        
	        
		}
	}
	
	public void TabsofAccountDetailsScreenVerify ()
	{
		//if (param2.contains("ios"))
		if (true)
		{
			
			WebDriverWait wait = new WebDriverWait(SuiteSetupTest.driver, 60);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("loading"))));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("accountsBottomOption"))));
	        WebElement accountsBottom = CommonMethods.getElement("accountsBottomOption"); 
	        accountsBottom.click();
	        logger.info("Accounts Bottom clicked");
	        
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));
			logger.info("Fetching Data invisibled");
			
			CommonMethods.testElementAssert("accountHeading", "Accounts");	 
			logger.info("Accounts heading asserted");

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("SearchText"))));
	        WebElement VMWare = CommonMethods.getElement("SearchText"); 
	        VMWare.sendKeys("Discovery Natural");
	        logger.info("Discovery Natural searched");
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("DiscoveryNaturalClick"))));
	        WebElement DiscoveryNatural = CommonMethods.getElement("DiscoveryNaturalClick"); 
	        DiscoveryNatural.click();
	        logger.info("Discovery Natural row clicked");
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("performanceTab"))));
	        WebElement performance = CommonMethods.getElement("performanceTab"); 
	        performance.click();
	        logger.info("Performance Tab clicked");
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("opportunitiesTab"))));
	        WebElement opportunitiesTab = CommonMethods.getElement("opportunitiesTab"); 
	        opportunitiesTab.click();
	        logger.info("Opportunities Tab clicked");
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("activityTab"))));
	        WebElement activity = CommonMethods.getElement("activityTab"); 
	        activity.click();
	        logger.info("Activity Tab clicked");
	        
	        WebElement NotificationTab = CommonMethods.getElement("NotificationTab"); 
	        NotificationTab.click();
	        logger.info("Notification tab of Activity Tab clicked");
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("SRsTab"))));
	        WebElement SRs = CommonMethods.getElement("SRsTab"); 
	        SRs.click();
	        logger.info("SRs Tab clicked");
		}
	}
	
	
	
	public void contactsTabofAccountDetailsScreen()
	{
		//if (param2.contains("ios"))
		if (true)
		{

			WebDriverWait wait = new WebDriverWait(SuiteSetupTest.driver, 60);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("loading"))));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("accountsBottomOption"))));
	        WebElement accountsBottom = CommonMethods.getElement("accountsBottomOption"); 
	        accountsBottom.click();
	        logger.info("Accounts Bottom clicked");
	        
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));
			logger.info("Fetching Data invisibled");
			
			CommonMethods.testElementAssert("accountHeading", "Accounts");	 
			logger.info("Accounts heading asserted");

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("SearchText"))));
	        WebElement VMWare = CommonMethods.getElement("SearchText"); 
	        VMWare.sendKeys("Discovery Natural");
	        logger.info("Discovery Natural searched");
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("DiscoveryNaturalClick"))));
	        WebElement DiscoveryNatural = CommonMethods.getElement("DiscoveryNaturalClick"); 
	        DiscoveryNatural.click();
	        logger.info("Discovery Natural row clicked");

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("ContactsTab"))));
			WebElement Contacts = CommonMethods.getElement("ContactsTab");
			Contacts.click();
			logger.info("Contacts Tab clicked");

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("BartWaress"))));
			WebElement BartWaressText = CommonMethods.getElement("BartWaress");
			BartWaressText.click();
			logger.info("Bart Waress clicked");

			//SuiteSetupTest.driver.navigate().back();

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("bckButton"))));
			WebElement bckAccount = CommonMethods.getElement("bckButton");
			bckAccount.click();
			logger.info("Back clicked");

		}
	}
	
}
