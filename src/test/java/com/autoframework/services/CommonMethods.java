package com.autoframework.services;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.autoframework.test.SuiteSetupTest;
import com.autoframework.utils.AppiumConfig;

public class CommonMethods
{

	
	private static final Logger logger = Logger.getLogger(CommonMethods.class);

	//Method for Asserting text of element
	public static void testElementAssert(String xpath, String expectedText)
	{
		WebElement element = SuiteSetupTest.driver.findElement(By.xpath(SuiteSetupTest.prop.getProperty(xpath)));
		String elementText = element.getAttribute(SuiteSetupTest.prop.getProperty("text"));
		Assert.assertNotNull(element);
		Assert.assertEquals(expectedText, elementText);
	}

	//Return element after asserting
	public static WebElement getElementAfterAssertEquals(String xpath, String expectedText)
	{
		WebElement element = SuiteSetupTest.driver.findElement(By.xpath(SuiteSetupTest.prop.getProperty(xpath)));
		String elementText = element.getAttribute(SuiteSetupTest.prop.getProperty("text"));
		Assert.assertNotNull(element);
		Assert.assertEquals(expectedText, elementText);
		return element;
	}

	//Returning element 
	public static WebElement getElement(String xpath_locator_String)
	{
		logger.info("Inside the GetElement Method. Trying to find the element: "+xpath_locator_String);
		WebDriverWait wait = new WebDriverWait(SuiteSetupTest.driver, 60);
		WebElement element=null;
		try{
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath_locator_String)));
				element = SuiteSetupTest.driver.findElement(By.xpath(xpath_locator_String));
				
				boolean chkElement = element.isDisplayed();
				
				if(chkElement){
								Assert.assertEquals(element.isDisplayed(),true);
								logger.info("Element found - returning the element");
								Assert.assertNotNull(element);
								return element;
				}
				/*else{
					
					throw new NoSuchElementException(xpath_locator_String);
				}*/
				}
			
		catch(NoSuchElementException e1){
			logger.info("Element not found: "+xpath_locator_String);
			//e1.printStackTrace();	
		}
		catch(Exception e2){
			logger.info("Unknown Exception encountered. Printing the stack trace");
			e2.printStackTrace();	
		}
		
		logger.info("Getting out of GetElement Method.");
		
		return element;
		
		
		
	}
}
