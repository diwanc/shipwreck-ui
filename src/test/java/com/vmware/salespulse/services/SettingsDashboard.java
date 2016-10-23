package com.vmware.salespulse.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vmware.salespulse.models.SalespulsePojo;
import com.vmware.salespulse.test.SuiteSetupTest;

public class SettingsDashboard 
{
	private static final Logger logger = Logger.getLogger(SettingsDashboard.class);
	SalespulsePojo vPOJO = new SalespulsePojo();
	String param2 = System.getProperty("env.OS");
	
	public void dashboardCustomizeScreenVerify()
	{
		//if (param2.contains("ios"))
		if (true)
		{

			WebDriverWait wait = new WebDriverWait(SuiteSetupTest.driver, 60);
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("settingButton"))));
	        WebElement setting = CommonMethods.getElement("settingButton"); 
	        setting.click();
	        logger.info("Setting clicked");
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("customizeDashboard"))));
	        WebElement customizeDashboard = CommonMethods.getElement("customizeDashboard"); 
	        logger.info("Customize Dashboard heading asserted");
        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("cancelBtn"))));
	        WebElement cancel = CommonMethods.getElement("cancelBtn"); 
	        cancel.click();
	        logger.info("Cancel Button clicked");
		}
	}
	
	public void gridViewTabVerify()
	{
		//if (param2.contains("ios"))
		if (true)
		{

			WebDriverWait wait = new WebDriverWait(SuiteSetupTest.driver, 60);
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("settingButton"))));
	        WebElement setting = CommonMethods.getElement("settingButton"); 
	        setting.click();
	        logger.info("Setting clicked");
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("customizeDashboard"))));
	        WebElement customizeDashboard = CommonMethods.getElement("customizeDashboard"); 
	        logger.info("Customize Dashboard heading asserted");
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("gridView"))));
	        WebElement grid = CommonMethods.getElement("gridView"); 
	        grid.click();
	        logger.info("Grid View clicked");
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("cancelBtn"))));
	        WebElement cancel = CommonMethods.getElement("cancelBtn"); 
	        cancel.click();
	        logger.info("Cancel Button clicked");
		}
	}
}
