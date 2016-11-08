package com.autoframework.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.autoframework.utils.CommonMethods;

public class ViewShipwrecksPage {
			
	private static final Logger logger = Logger.getLogger(ViewShipwrecksPage.class);
	
	public static void _ViewShipwreckDetail_ByName(WebDriver driver, String ShipWreckName){
		
		String varFinalViewXpath = "//tr/descendant::td[contains(text()," + " '" +  ShipWreckName +  "')]/following-sibling::td/descendant::a[contains(text(), 'View')]";
		WebElement objViewShipwreck_ByName = CommonMethods.getElement(driver,varFinalViewXpath);
		objViewShipwreck_ByName.click();
		logger.info("View page of Details of shipwreck");
	}
	
	public static void _DeleteShipwreckDetail_ByName(WebDriver driver, String ShipWreckName){
		
		String varFinalViewXpath = "//tr/descendant::td[contains(text()," + " '" +  ShipWreckName +  "')]/following-sibling::td/descendant::a[contains(text(), 'Delete')]";
		WebElement objViewShipwreck_ByName = CommonMethods.getElement(driver,varFinalViewXpath);
		objViewShipwreck_ByName.click();
		logger.info("View page of Details of shipwreck");
	}
	
	
	


		
}
