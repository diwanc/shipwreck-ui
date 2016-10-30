package com.autoframework.test;

import org.apache.log4j.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.autoframework.services.HomePageSelendroid;
import com.autoframework.utils.ScreenshotUtility;

@Listeners({ ScreenshotUtility.class })

public class SelendroidAppTests
{
	private static final Logger logger = Logger.getLogger(SelendroidAppTests.class);
	
	//Intiatlize the page objects
	HomePageSelendroid hp = new HomePageSelendroid (); 
	
	@Test(groups = {"sanitytest"}, priority = 0, enabled=true)
	public void HomePage_ClickButtonTest() {
		
		logger.info("Executing HomePage_ClickButtonTest");	
		hp.HomePageSelendroid_ClickButton_DisplayToast();
		
	}
	
	@Test(groups = {"sanitytest"}, priority = 0, enabled=false)
	public void HomePage_ValidateEditBox() {
		
		logger.info("Executing Edit box test case");	
		hp.HomePageSelendroid_SetEditBox();
		
	}
	
	
	
	
}
