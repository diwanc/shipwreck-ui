package com.vmware.salespulse.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.vmware.salespulse.test.SuiteSetupTest;



public class Login
{
	private static final Logger logger = Logger.getLogger(Login.class);

	
	public void loginTest()
	{
		logger.info("In Login class");
		WebDriverWait wait = new WebDriverWait(SuiteSetupTest.driver, 60);
		//logger.info(SuiteSetupTest.prop.getProperty("salesPulseTitle"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("salesPulseTitle"))));
		CommonMethods.testElementAssert("salesPulseTitle", "SalesPulse");
		logger.info("SalesPulse heading asserted");
		
		WebElement emailAddress = CommonMethods.getElement("emailAddressField");
		emailAddress.click();
		emailAddress.clear();
		emailAddress.sendKeys("howardc");
		logger.info("Email entered");
		
		WebElement password = CommonMethods.getElement("passwordField");
		password.click();
		password.clear();
		password.sendKeys("anything");
		logger.info("Password entered");
		
		WebElement login = CommonMethods.getElement("loginButton");
		login.click();
		logger.info("Login button clicked");
		
	}

}
