package com.vmware.salespulse.services;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.vmware.salespulse.test.SuiteSetupTest;

public class CommonMethods
{

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
	public static WebElement getElement(String xpath)
	{
		WebElement element = SuiteSetupTest.driver.findElement(By.xpath(SuiteSetupTest.prop.getProperty(xpath)));
		Assert.assertNotNull(element);
		return element;
	}
}
