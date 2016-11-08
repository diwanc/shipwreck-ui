package com.autoframework.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.autoframework.utils.CommonMethods;

public class ViewShipwrecksDetailPage {
			
	private static final Logger logger = Logger.getLogger(ViewShipwrecksDetailPage.class);
	
	public static String _ValidateShipwreckDetailPage_ByName(WebDriver driver){
		
		//String varFinalViewXpath = "//tr/descendant::td[contains(text()," + " '" +  ShipWreckName +  "')]/following-sibling::td/descendant::a[contains(text(), 'View')]";
		
		WebElement objViewShipwreckDetail_ByName = CommonMethods.getElement(driver,"//h3");
		String var_GetDetail = objViewShipwreckDetail_ByName.getText();
		logger.info("Returining the details - "+var_GetDetail);
		return var_GetDetail;
		
	}
	
		public static String _ValidateShipwreckDetailPage_ByProp(WebDriver driver, String Name){
			
			String varFinalViewDetailXpath = "//td[contains(text(), '"+Name+"')]/following-sibling::td";
			
			WebElement objViewShipwreckDetail_ByName = CommonMethods.getElement(driver,varFinalViewDetailXpath);
			String var_GetDetailNode = objViewShipwreckDetail_ByName.getText();
			logger.info("Returining the details - "+var_GetDetailNode);
			return var_GetDetailNode;
		
	}
	
	
	


		
}
