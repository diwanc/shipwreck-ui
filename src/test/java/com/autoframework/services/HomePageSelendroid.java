package com.autoframework.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.autoframework.test.SuiteSetupTest;



public class HomePageSelendroid {
	
private static final Logger logger = Logger.getLogger(HomePageSelendroid.class);

	
	public HomePageSelendroid HomePageSelendroid_SetEditBox()
	{
		logger.info("In Homepage class");
		WebElement q1 = CommonMethods.getElement(SuiteSetupTest.prop.getProperty("homePage_EditBox"));
		q1.sendKeys("Hi there..................................................");
		return this;
		
	}
	
	public HomePageSelendroid HomePageSelendroid_ClickButton_DisplayToast()
	{
		logger.info("In HomePageSelendroid_ClickButton_DisplayToast");
		CommonMethods.getElement(SuiteSetupTest.prop.getProperty("homePage_DisplayToast")).click();
		return this;
		
	}

}