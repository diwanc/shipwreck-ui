/*package com.autoframework.test;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Listeners;

import com.autoframework.utils.ScreenshotUtility;

public class SuiteTearDownTest
{

	private static final Logger logger = Logger.getLogger(SuiteTearDownTest.class);

	@AfterSuite(groups = {  "sanitytest", "smoke"  })
	public static void teardown()
	{
		//close the app
	    SuiteSetupTest.driver.quit();
		logger.info("app is closed");
	}
}
*/