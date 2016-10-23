package com.vmware.salespulse.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vmware.salespulse.models.SalespulsePojo;
import com.vmware.salespulse.test.SuiteSetupTest;

public class Notification 
{
	private static final Logger logger = Logger.getLogger(Notification.class);
	SalespulsePojo vPOJO = new SalespulsePojo();
	String param2 = System.getProperty("env.OS");
	
	
	public void notificationScreenVerify()
	{
		//if (param2.contains("ios"))
				if (true)
		{
			WebDriverWait wait = new WebDriverWait(SuiteSetupTest.driver, 60);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("notificationButton"))));
	        WebElement notification = CommonMethods.getElement("notificationButton"); 
	        notification.click();
	        logger.info("Notification button clicked");
	        
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("backBtn"))));
	        WebElement back = CommonMethods.getElement("backBtn"); 
	        back.click();
	        logger.info("Back clicked");
		}
	}
	
	public void notificationTabofNotificationScreen()
	{
		//if (param2.contains("ios"))
				if (true)
		{
			WebDriverWait wait = new WebDriverWait(SuiteSetupTest.driver, 60);
	        
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("notificationButton"))));
	        WebElement notification = CommonMethods.getElement("notificationButton"); 
	        notification.click();
	        logger.info("Notification button clicked");
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("notification"))));
	        WebElement notification1 = CommonMethods.getElement("notification"); 
	        notification1.click();
	        logger.info("Notification tab clicked");
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("backBtn"))));
	        WebElement back = CommonMethods.getElement("backBtn"); 
	        back.click();
	        logger.info("Back clicked");
		}
	}
}
