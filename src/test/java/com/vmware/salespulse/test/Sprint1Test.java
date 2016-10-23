package com.vmware.salespulse.test;
import org.apache.log4j.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vmware.salespulse.services.AccountNeeding;
import com.vmware.salespulse.services.DealsOfWeek;
import com.vmware.salespulse.services.DiscussionsScreen;
import com.vmware.salespulse.services.LatestInsights;
import com.vmware.salespulse.services.Login;
import com.vmware.salespulse.services.DashboardScreen;
import com.vmware.salespulse.services.InsightScreen;
import com.vmware.salespulse.services.AccountScreen;
import com.vmware.salespulse.services.Logout;
import com.vmware.salespulse.services.Notification;
import com.vmware.salespulse.services.PipelineView;
import com.vmware.salespulse.services.PlanForToday;
import com.vmware.salespulse.services.SettingsDashboard;
import com.vmware.salespulse.services.AgendaScreen;
import com.vmware.salespulse.services.SupportRequestScreen;
import com.vmware.salespulse.utils.ScreenshotUtility;

@Listeners({ ScreenshotUtility.class })
public class Sprint1Test {

	private static final Logger logger = Logger.getLogger(Sprint1Test.class);
	Login loginObj = new Login();
	DashboardScreen dashboardObj = new DashboardScreen();
	InsightScreen insightScreenObj = new InsightScreen();
	AccountScreen accountScreenObj = new AccountScreen();	
	DiscussionsScreen discussionsScreenObj = new DiscussionsScreen();
	Notification notificationScreenObj = new Notification();
	SettingsDashboard settingsObj = new SettingsDashboard();
	AgendaScreen agendaScreenObj = new AgendaScreen();
	Logout logoutObj = new Logout();
	AccountNeeding accountNeedingObj = new AccountNeeding();
	PipelineView pipelineViewObj = new PipelineView();
	SupportRequestScreen supportRequestObj = new SupportRequestScreen();
	PlanForToday planForTodayObj = new PlanForToday();
	LatestInsights latestInsightsObj = new LatestInsights();
	DealsOfWeek dealsOfWeekObj = new DealsOfWeek();
	// Test scripts for execution according to set priority
	
	@Test(groups = {  "sanitytest"  }, priority = 0, enabled=true)
	public void login() {
		
		logger.info("Executing 1st test case");	
		loginObj.loginTest();
		//Create object of test class and call test method
		
	}
	
	@Test(groups = {  "sanitytest"  }, priority = 1, enabled=true)
	public void dashboardScreen() {
		
		logger.info("Executing 2nd test case");	
		dashboardObj.dashboardScreenVerify();
		//Create object of test class and call test method
		
	}
	
	@Test(groups = {  "sanitytest"  }, priority = 2, enabled=true)
	public void notificationScreen() {
		
		logger.info("Executing 3rd test case");	
		notificationScreenObj.notificationScreenVerify();
		//Create object of test class and call test method
		
	}
	
	@Test(groups = {  "sanitytest"  }, priority = 3, enabled=true)
	public void settingsDashboard() {
		
		logger.info("Executing 4th test case");	
		settingsObj.dashboardCustomizeScreenVerify();
		//Create object of test class and call test method
		
	}
	
	@Test(groups = {  "sanitytest"  }, priority = 4, enabled=true)
	public void insightScreen() {
		
		logger.info("Executing 5th test case");	
		insightScreenObj.insightScreenVerify();
		//Create object of test class and call test method
		
	}
	
	@Test(groups = {  "sanitytest"  }, priority = 5, enabled=true)
	public void accountScreen() {
		
		logger.info("Executing 6th test case");	
		accountScreenObj.accountScreenVerify();
		//Create object of test class and call test method
		
	}
	
	@Test(groups = {  "sanitytest"  }, priority = 6, enabled=true)
	public void discussionsScreen() {
		
		logger.info("Executing 7th test case");	
		discussionsScreenObj.discussionsScreenVerify();
		//Create object of test class and call test method
		
	}
	
	@Test(groups = {  "sanitytest"  }, priority = 7, enabled=true)
	public void agendaScreen() {
		
		logger.info("Executing 8th test case");	
		agendaScreenObj.agendaScreenVerify();
		//Create object of test class and call test method
		
	}
	
	@Test(groups = {  "sanitytest"  }, priority = 8, enabled=true)
	public void pipelineView() {
		
		logger.info("Executing 9th test case");	
		pipelineViewObj.pipelineViewVerify();
		//Create object of test class and call test method
		
	}
	
	@Test(groups = {  "sanitytest"  }, priority = 9, enabled=false)
	public void accountNeedingAttention() {
		
		logger.info("Executing 10th test case");	
		accountNeedingObj.accountNeedingAttentionVerify();
		//Create object of test class and call test method
		
	}
	
		
	@Test(groups = {  "sanitytest"  }, priority = 10, enabled=false)
	public void planforToday() {
		
		logger.info("Executing 11th test case");	
		planForTodayObj.planForTodayverify();
		//Create object of test class and call test method
		
	}
	
	@Test(groups = {  "sanitytest"  }, priority = 11, enabled=false)
	public void latestInsights() {
		
		logger.info("Executing 12th test case");	
		latestInsightsObj.latestInsightVerify();
		//Create object of test class and call test method
		
	}
	
	@Test(groups = {  "sanitytest"  }, priority = 12, enabled=false)
	public void dealsOfTheWeek() {
		
		logger.info("Executing 13th test case");	
		dealsOfWeekObj.dealsOfWeekVerify();
		//Create object of test class and call test method
		
	}
	
	@Test(groups = {  "sanitytest"  }, priority = 13, enabled=false)
	public void supportRequest() {
		
		logger.info("Executing 14th test case");	
		supportRequestObj.supportRequestverify();
		//Create object of test class and call test method
		
	}
	
	@Test(groups = {  "sanitytest"  }, priority = 14, enabled=false)
	public void logOut() {
		
		logger.info("Executing 15th test case");	
		logoutObj.logoutTest();
		//Create object of test class and call test method
		
	}
	
	
	
}
