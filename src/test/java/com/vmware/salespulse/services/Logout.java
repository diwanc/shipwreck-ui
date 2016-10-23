package com.vmware.salespulse.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vmware.salespulse.test.SuiteSetupTest;

public class Logout
{
	private static final Logger logger = Logger.getLogger(Logout.class);


	public void logoutTest()
	{
		WebDriverWait wait = new WebDriverWait(SuiteSetupTest.driver, 60);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));
		logger.info("Fetching Data invisibled");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("dashboardBottom"))));
		WebElement dashboardBottom = CommonMethods.getElement("dashboardBottom"); 
		dashboardBottom.click();
        logger.info("Dashboard Bottom clicked");
		
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));
		logger.info("Fetching Data invisibled");
		
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("logoutButton"))));
        WebElement logoutButton = CommonMethods.getElement("logoutButton"); 
        logoutButton.click();
        logger.info("Logout button clicked");
       
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("popUpYES"))));
        WebElement popUpYES = CommonMethods.getElement("popUpYES"); 
        popUpYES.click();
        logger.info("Yes button clicked");
		
	}

}
