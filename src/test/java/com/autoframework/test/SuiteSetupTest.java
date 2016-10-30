package com.autoframework.test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.openqa.selenium.remote.CapabilityType;

import com.autoframework.connectors.DatabaseConnectionHolder;
import com.autoframework.utils.ScreenshotUtility;

public class SuiteSetupTest
{
	private static final Logger logger = Logger.getLogger(SuiteSetupTest.class);
	public static AppiumDriver driver;
	public static final Properties prop = new Properties();
	public static final String USERNAME = "SDP_Sauce8";
	public static final String ACCESS_KEY = "98a3e24c-bdb0-4014-a38f-1a7bf9618733";
	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@localhost:4445/wd/hub";
	public static final Properties databaseProp = new Properties();
	public static DatabaseConnectionHolder dch1;
	public static Connection connection1;
	
	//@BeforeSuite for smoke suite
	@BeforeGroups(groups = {  "sanitytest"  })
	public static void sanitySetup() throws Exception
	{
		logger.info("Running Sanity suite");
		String appPath;
		String platformVersion;
		String deviceName;
		String param1 = System.getProperty("env.USER");
		logger.info("parameter1 CD or QAUSER : " + param1);
		String param2 = System.getProperty("env.OS");
		logger.info("parameter2, Android or iOS : " + param2);
		String param3 = System.getProperty("suiteName");
		logger.info("parameter3, Suite Name : " + param3);
		InputStream input = null;
		
		//Setting the param according to 
		/*if (param1.contains("SAUCE"))
		{
			logger.info("Setting Sauce App path");
			appPath = prop.getProperty("appPathSAUCE");
			platformVersion = prop.getProperty("platformVersion");
			deviceName = prop.getProperty("deviceName");
		}
		else
		{*/
	
			
			
		//}
		if (param2.contains("ios"))
		{
			logger.info("Running script for iOS");
			try
			{
				input = new FileInputStream("src/test/resources/ios.properties");
				// load a properties file
				prop.load(input);
			}
			catch (IOException ex)
			{
				logger.info(ex);
			}
			finally
			{
				if (input != null)
				{
					try
					{
						input.close();
					}
					catch (IOException e)
					{
						logger.info(e);
					}
				}
			}
			
			
		}
		else
		{
			logger.info("Running script for Android");
			try
			{
				input = new FileInputStream("src/test/resources/android.properties");
				// load a properties file
				prop.load(input);
			}
			catch (IOException ex)
			{
				logger.info(ex);
			}
			finally
			{
				if (input != null)
				{
					try
					{
						input.close();
					}
					catch (IOException e)
					{
						logger.info(e);
					}
				}
			}
			
			
		}
		
			
	
	
	
	appPath = prop.getProperty("appPathLocal");
	logger.info("Setting Local App path: "+appPath);
	platformVersion = prop.getProperty("cdqalocalplatformVersion");
	deviceName = prop.getProperty("cdqalocaldeviceName");
	logger.info("Setting device name: "+deviceName);
	
	//Setting  Capabilities
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("appium-version", prop.getProperty("appiumVersion"));
			capabilities.setCapability("platformName", prop.getProperty("platformName"));
			capabilities.setCapability("platformVersion", platformVersion);
			capabilities.setCapability("app", appPath);
			capabilities.setCapability("name", "vWelcome");
			capabilities.setCapability("noReset", "false");
			capabilities.setCapability("deviceName", deviceName);
	
	
			
			/*
			//new code
			logger.info("Setting driver for iOS");
			driver = new IOSDriver((new URL("http://0.0.0.0:4723/wd/hub")), capabilities);
			*/
			
			//logger.info("Setting driver for android");
			driver = new AndroidDriver((new URL("http://127.0.0.1:4723/wd/hub")), capabilities);
			
			
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
			
			
	}		
			
			
			
			
		
		//Database Connection
		
			// load a properties file
/*			try
			{
				input = new FileInputStream("src/test/resources/databaseInfo.properties");
				databaseProp.load(input);
			}
			catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			dch1 = new DatabaseConnectionHolder(databaseProp.getProperty("jDBC_DRIVER"), databaseProp.getProperty("dB_URL"), databaseProp.getProperty("user"), databaseProp.getProperty("pass"));
			try
			{
				connection1 = dch1.getConnection();
			}
			catch (Exception e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
*/
		
	
	}

