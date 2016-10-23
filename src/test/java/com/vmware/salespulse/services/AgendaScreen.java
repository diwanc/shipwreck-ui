package com.vmware.salespulse.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vmware.salespulse.models.SalespulsePojo;
import com.vmware.salespulse.test.SuiteSetupTest;

public class AgendaScreen 
{
	private static final Logger logger = Logger.getLogger(AgendaScreen.class);
	SalespulsePojo vPOJO = new SalespulsePojo();
	String param2 = System.getProperty("env.OS");
	String createdTask = "Automated_Task";
	
	public void agendaScreenVerify()
	{
		if (param2.contains("ios"))
		
		{
			WebDriverWait wait = new WebDriverWait(SuiteSetupTest.driver, 60);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("loading"))));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));

	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("agendaBottomOption"))));
	        WebElement agenda = CommonMethods.getElement("agendaBottomOption"); 
	        agenda.click();
	        logger.info("Agenda Bottom navigation clicked");
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("oKBtn"))));
	        WebElement ok = CommonMethods.getElement("oKBtn"); 
	        ok.click();
	        logger.info("OK Bottom clicked");
			
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));

			logger.info("Fetching data Invisibled");
			
			CommonMethods.testElementAssert("insightScreenHeading", "Agenda");	
			logger.info("Agenda heading asserted");
		}
		
		else
		{
			WebDriverWait wait = new WebDriverWait(SuiteSetupTest.driver, 60);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("loading"))));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));

	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("agendaBottomOption"))));
	        WebElement agenda = CommonMethods.getElement("agendaBottomOption"); 
	        agenda.click();
	        logger.info("Agenda Bottom navigation clicked");
	        
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));
	        
			logger.info("Fetching data Invisibled");
			
			CommonMethods.testElementAssert("insightScreenHeading", "Agenda");	
			logger.info("Agenda heading asserted");
		}
	}
	
	
	public void tabsofAgendaScreen()
	{
		if (param2.contains("ios"))
		
		{
			WebDriverWait wait = new WebDriverWait(SuiteSetupTest.driver, 60);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("loading"))));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));

	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("agendaBottomOption"))));
	        WebElement agenda = CommonMethods.getElement("agendaBottomOption"); 
	        agenda.click();
	        logger.info("Agenda Bottom navigation clicked");
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("oKBtn"))));
	        WebElement ok = CommonMethods.getElement("oKBtn"); 
	        ok.click();
	        logger.info("OK Bottom clicked");
	        
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));
	        
			logger.info("Fetching data Invisibled");
			
	        CommonMethods.testElementAssert("insightScreenHeading", "Agenda");	
			logger.info("Agenda heading asserted");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("taskTab"))));
	        WebElement task = CommonMethods.getElement("taskTab"); 
	        task.click();
	        logger.info("Task tab clicked");
			
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("meetingsTab"))));
	        WebElement meetings = CommonMethods.getElement("meetingsTab"); 
	        meetings.click();
	        logger.info("Meetings tab clicked");
	           
		}
		
		else
		{
			WebDriverWait wait = new WebDriverWait(SuiteSetupTest.driver, 60);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("loading"))));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));

	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("agendaBottomOption"))));
	        WebElement agenda = CommonMethods.getElement("agendaBottomOption"); 
	        agenda.click();
	        logger.info("Agenda Bottom navigation clicked");
	        
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));

			logger.info("Fetching data Invisibled");
			
			CommonMethods.testElementAssert("insightScreenHeading", "Agenda");	
			logger.info("Agenda heading asserted");
				
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("taskTab"))));
	        WebElement task = CommonMethods.getElement("taskTab"); 
	        task.click();
	        logger.info("Task tab clicked");
			
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("meetingsTab"))));
	        WebElement meetings = CommonMethods.getElement("meetingsTab"); 
	        meetings.click();
	        logger.info("Meetings tab clicked");
	        
		}
	}
	
	public void createTaskonAgendaScreen()
	{
		if (param2.contains("ios"))
		
		{
			WebDriverWait wait = new WebDriverWait(SuiteSetupTest.driver, 60);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("loading"))));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));

	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("agendaBottomOption"))));
	        WebElement agenda = CommonMethods.getElement("agendaBottomOption"); 
	        agenda.click();
	        logger.info("Agenda Bottom navigation clicked");
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("oKBtn"))));
	        WebElement ok = CommonMethods.getElement("oKBtn"); 
	        ok.click();
	        logger.info("OK Bottom clicked");
	        
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));
			logger.info("Fetching data Invisibled");
			
			CommonMethods.testElementAssert("insightScreenHeading", "Agenda");	
			logger.info("Agenda heading asserted");
			
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("plusBtn"))));
	        WebElement taskAdd = CommonMethods.getElement("plusBtn"); 
	        taskAdd.click();
	        logger.info("Plus add task clicked");
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("taskName"))));
	        WebElement taskName = CommonMethods.getElement("taskName");
	        taskName.sendKeys(createdTask);
			logger.info("Task Name entered");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("taskdescription"))));
	        WebElement taskDesc = CommonMethods.getElement("taskdescription");
	        taskDesc.sendKeys("Created using Automation");
			logger.info("Task Description entered");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("tagAccount"))));
	        WebElement tagaAccount = CommonMethods.getElement("tagAccount"); 
	        tagaAccount.click();
	        logger.info("Tag a account clicked");
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("firstAccountSelected"))));
	        WebElement firstrow = CommonMethods.getElement("firstAccountSelected"); 
	        firstrow.click();
	        logger.info("First row of accounts selected");
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("tagContact"))));
	        WebElement tagaContact = CommonMethods.getElement("tagContact"); 
	        tagaContact.click();
	        logger.info("Tag a contact clicked");
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("contactSelected"))));
	        WebElement contactSelect = CommonMethods.getElement("contactSelected"); 
	        contactSelect.click();
	        logger.info("Contact selected");
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("addTask"))));
	        WebElement addTaskAgenda = CommonMethods.getElement("addTask"); 
	        addTaskAgenda.click();
	        logger.info("Add task clicked");
	        
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("updatingData"))));
			logger.info("Updating Data invisibled");
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//UIAStaticText[@value='"+createdTask+"']")));
			WebElement tasktitle = SuiteSetupTest.driver.findElement(By.xpath("//UIAStaticText[@value='"+createdTask+"']"));
			
		}
		
		else
		{
			WebDriverWait wait = new WebDriverWait(SuiteSetupTest.driver, 60);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("loading"))));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));

	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("agendaBottomOption"))));
	        WebElement agenda = CommonMethods.getElement("agendaBottomOption"); 
	        agenda.click();
	        logger.info("Agenda Bottom navigation clicked");
	        
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));
			logger.info("Fetching data Invisibled");
			
			CommonMethods.testElementAssert("insightScreenHeading", "Agenda");	
			logger.info("Agenda heading asserted");
			
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("plusBtn"))));
	        WebElement taskAdd = CommonMethods.getElement("plusBtn"); 
	        taskAdd.click();
	        logger.info("Plus add task clicked");
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("taskName"))));
	        WebElement taskName = CommonMethods.getElement("taskName");
	        taskName.sendKeys(createdTask);
			logger.info("Task Name entered");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("taskdescription"))));
	        WebElement taskDesc = CommonMethods.getElement("taskdescription");
	        taskDesc.sendKeys("Created using Automation");
			logger.info("Task Description entered");
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("addTask"))));
	        WebElement addTaskAgenda = CommonMethods.getElement("addTask"); 
	        addTaskAgenda.click();
	        logger.info("Add task clicked");
	        
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("updatingData"))));
			logger.info("Updating Data invisibled");
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='"+createdTask+"']")));
			WebElement tasktitle = SuiteSetupTest.driver.findElement(By.xpath("//android.widget.TextView[@text='"+createdTask+"']"));
			
		}
	}
	
	public void openAndEditTaskonAgendaScreen()
	{
		if (param2.contains("ios"))
		
		{
			WebDriverWait wait = new WebDriverWait(SuiteSetupTest.driver, 60);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("loading"))));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));

	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("agendaBottomOption"))));
	        WebElement agenda = CommonMethods.getElement("agendaBottomOption"); 
	        agenda.click();
	        logger.info("Agenda Bottom navigation clicked");
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("oKBtn"))));
	        WebElement ok = CommonMethods.getElement("oKBtn"); 
	        ok.click();
	        logger.info("OK Bottom clicked");
	        
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));
			logger.info("Fetching data Invisibled");
			
			CommonMethods.testElementAssert("insightScreenHeading", "Agenda");	
			logger.info("Agenda heading asserted");
			
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//UIAStaticText[@value='"+createdTask+"']")));
			WebElement tasktitle = SuiteSetupTest.driver.findElement(By.xpath("//UIAStaticText[@value='"+createdTask+"']"));
			tasktitle.click();
	        logger.info("Clicked on task");
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("editTask"))));
			WebElement editTask = SuiteSetupTest.driver.findElement(By.xpath(SuiteSetupTest.prop.getProperty("editTask")));
			editTask.click();
	        logger.info("Clicked on Edit Task");
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("updateTask"))));
			WebElement updateTaskTitle = SuiteSetupTest.driver.findElement(By.xpath(SuiteSetupTest.prop.getProperty("updateTask")));
			logger.info("Update Task Title asserted");
	        
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("saveButton"))));
			WebElement saveButton = SuiteSetupTest.driver.findElement(By.xpath(SuiteSetupTest.prop.getProperty("saveButton")));
			saveButton.click();
			logger.info("Save button clicked");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//UIAStaticText[@value='"+createdTask+"']")));
			tasktitle = SuiteSetupTest.driver.findElement(By.xpath("//UIAStaticText[@value='"+createdTask+"']"));

		}
		
		else
		{
			WebDriverWait wait = new WebDriverWait(SuiteSetupTest.driver, 60);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("loading"))));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));

	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("agendaBottomOption"))));
	        WebElement agenda = CommonMethods.getElement("agendaBottomOption"); 
	        agenda.click();
	        logger.info("Agenda Bottom navigation clicked");
	        
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));
			logger.info("Fetching data Invisibled");
			
			CommonMethods.testElementAssert("insightScreenHeading", "Agenda");	
			logger.info("Agenda heading asserted");
			
			//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View[1]/android.view.View[2]/android.support.v4.view.ViewPager[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.widget.TextView[1]
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*//android.view.View[1]/android.view.View[2]/android.widget.TextView[@text='"+createdTask+"']")));
			WebElement tasktitle = SuiteSetupTest.driver.findElement(By.xpath("//*//android.view.View[1]/android.view.View[2]/android.widget.TextView[@text='"+createdTask+"']"));
			tasktitle.click();
	        logger.info("Clicked on task");
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("editTask"))));
			WebElement editTask = SuiteSetupTest.driver.findElement(By.xpath(SuiteSetupTest.prop.getProperty("editTask")));
			editTask.click();
	        logger.info("Clicked on Edit Task");
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("updateTask"))));
			WebElement updateTaskTitle = SuiteSetupTest.driver.findElement(By.xpath(SuiteSetupTest.prop.getProperty("updateTask")));
			logger.info("Update Task Title asserted");
	        
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("saveButton"))));
			WebElement saveButton = SuiteSetupTest.driver.findElement(By.xpath(SuiteSetupTest.prop.getProperty("saveButton")));
			saveButton.click();
			logger.info("Save button clicked");
			
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("updatingData"))));
			logger.info("Updating Data invisibled");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*//android.view.View[1]/android.view.View[2]/android.widget.TextView[@text='"+createdTask+"']")));
			
		}
	}
	
	public void markAsCompleteTaskOnAgendaScreen()
	{
		if (param2.contains("ios"))
		
		{
			WebDriverWait wait = new WebDriverWait(SuiteSetupTest.driver, 60);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("loading"))));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));

	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("agendaBottomOption"))));
	        WebElement agenda = CommonMethods.getElement("agendaBottomOption"); 
	        agenda.click();
	        logger.info("Agenda Bottom navigation clicked");
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("oKBtn"))));
	        WebElement ok = CommonMethods.getElement("oKBtn"); 
	        ok.click();
	        logger.info("OK Bottom clicked");
			
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));
			logger.info("Fetching data Invisibled");
			
			CommonMethods.testElementAssert("insightScreenHeading", "Agenda");	
			logger.info("Agenda heading asserted");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//UIAStaticText[@value='"+createdTask+"']")));
			WebElement tasktitle = SuiteSetupTest.driver.findElement(By.xpath("//UIAStaticText[@value='"+createdTask+"']"));
			tasktitle.click();
	        logger.info("Clicked on task");
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("markAsComplete"))));
			WebElement markAsComplete = SuiteSetupTest.driver.findElement(By.xpath(SuiteSetupTest.prop.getProperty("markAsComplete")));
			markAsComplete.click();
			logger.info("Mark as Complete button clicked");
	        
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("updatingData"))));
		}
		
		else
		{
			WebDriverWait wait = new WebDriverWait(SuiteSetupTest.driver, 60);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("loading"))));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));

	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("agendaBottomOption"))));
	        WebElement agenda = CommonMethods.getElement("agendaBottomOption"); 
	        agenda.click();
	        logger.info("Agenda Bottom navigation clicked");
	        
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("fetchingData"))));
			logger.info("Fetching data Invisibled");
			
			CommonMethods.testElementAssert("insightScreenHeading", "Agenda");	
			logger.info("Agenda heading asserted");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*//android.view.View[1]/android.view.View[2]/android.widget.TextView[@text='"+createdTask+"']")));
			WebElement tasktitle = SuiteSetupTest.driver.findElement(By.xpath("//*//android.view.View[1]/android.view.View[2]/android.widget.TextView[@text='"+createdTask+"']"));
			tasktitle.click();
	        logger.info("Clicked on task");
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("markAsComplete"))));
			WebElement markAsComplete = SuiteSetupTest.driver.findElement(By.xpath(SuiteSetupTest.prop.getProperty("markAsComplete")));
			markAsComplete.click();
			logger.info("Mark as Complete button clicked");
			
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SuiteSetupTest.prop.getProperty("updatingData"))));
	           
		}
	}
	
}
