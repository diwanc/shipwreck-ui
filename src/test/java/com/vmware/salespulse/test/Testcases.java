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

public class Testcases
{
	private static final Logger logger = Logger.getLogger(Testcases.class);
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
	
	
	@Test(groups = {  "sanitytest", "smoke"  }, priority = 0, enabled=true)
	public void login() {
		
		logger.info("Executing 'login' test case");	
		loginObj.loginTest();
		
	}
	
	@Test(groups = {  "sanitytest", "smoke"  }, priority = 1, enabled=true)
	public void dashboardScreen() {
		
		logger.info("Executing 'dashboardScreen' test case");
		loginObj.loginTest();
		dashboardObj.dashboardScreenVerify();
		
	}
	
	@Test(groups = {  "sanitytest", "smoke"   }, priority = 2, enabled=true)
	public void dashboardScreenAssertion() {
		
		logger.info("Executing 'dashboardScreenAssertion' test case");
		loginObj.loginTest();
		dashboardObj.dashboardScreenAssertion();
		
	}
	
	@Test(groups = {  "sanitytest", "smoke"  }, priority = 3, enabled=true)
	public void notificationScreen() {
		
		logger.info("Executing 'notificationScreen' test case");	
		loginObj.loginTest();
		notificationScreenObj.notificationScreenVerify();
	}
	
	@Test(groups = {  "sanitytest"  }, priority = 4, enabled=true)
	public void notificationTabofNotificationScreen() {
		
		logger.info("Executing 'notificationTabofNotificationScreen' test case");	
		loginObj.loginTest();
		notificationScreenObj.notificationTabofNotificationScreen();	
	}
	
	@Test(groups = {  "sanitytest", "smoke"   }, priority = 5, enabled=true)
	public void openCustomizedDashboardscreen() {
		
		logger.info("Executing 'openCustomizedDashboardscreen' test case");	
		loginObj.loginTest();
		settingsObj.dashboardCustomizeScreenVerify();
	}
	
	@Test(groups = {  "sanitytest"  }, priority = 6, enabled=true)
	public void gridViewTabCustomizedDashboardscreen() {
		
		logger.info("Executing 'gridViewTabCustomizedDashboardscreen' test case");	
		loginObj.loginTest();
		settingsObj.gridViewTabVerify();
	}
	
	@Test(groups = {  "sanitytest", "smoke"  }, priority = 7, enabled=true)
	public void insightScreen() {
		
		logger.info("Executing 'insightScreen' test case");	
		loginObj.loginTest();
		insightScreenObj.insightScreenVerify();
		
	}
	
	@Test(groups = {  "sanitytest"  }, priority = 8, enabled=true)
	public void vmwareTabInsightScreen() {
		
		logger.info("Executing 'vmwareTabInsightScreen' test case");
		loginObj.loginTest();
		insightScreenObj.vmwareTabInsightsScreen();
	}

	@Test(groups = {  "sanitytest", "smoke"  }, priority = 9, enabled=true)
	public void accountScreen() {
		
		logger.info("Executing 'accountScreen' test case");	
		loginObj.loginTest();
		accountScreenObj.accountScreenVerify();
	}
	
	@Test(groups = {  "sanitytest", "smoke"  }, priority = 10, enabled=true)
	public void searchAccountScreen() {
		
		logger.info("Executing 'searchAccountScreen' test case");	
		loginObj.loginTest();
		accountScreenObj.searchAccountVerify();
	}
	
	@Test(groups = {  "sanitytest", "smoke"  }, priority = 11, enabled=true)
	public void accountDetailsScreen() {
		
		logger.info("Executing 'accountDetailsScreen' test case");	
		loginObj.loginTest();
		accountScreenObj.accountDetailsScreenVerify();
	}
	
	@Test(groups = {  "sanitytest" }, priority = 12, enabled=true)
	public void tabsofAccountDetailsScreen() {
		
		logger.info("Executing 'accountDetailsScreen' test case");	
		loginObj.loginTest();
		accountScreenObj.TabsofAccountDetailsScreenVerify();
	}
	
	@Test(groups = {  "sanitytest" }, priority = 13, enabled=true)
	public void contactsTabofAccountDetailsScreen() {
		
		logger.info("Executing 'contactsTabofAccountDetailsScreen' test case");	
		loginObj.loginTest();
		accountScreenObj.contactsTabofAccountDetailsScreen();
	}
	
	@Test(groups = {  "sanitytest", "smoke"  }, priority = 14, enabled=true)
	public void discussionsScreen() {
		
		logger.info("Executing 'discussionsScreen' test case");	
		loginObj.loginTest();
		discussionsScreenObj.discussionsScreenVerify();
	}
	
	@Test(groups = {  "sanitytest"  }, priority = 15, enabled=true)
	public void contactofDiscussionsScreen() {
		
		logger.info("Executing 'contactofDiscussionsScreen' test case");	
		loginObj.loginTest();
		discussionsScreenObj.contactofDiscussionsScreenVerify();
	}
	
	@Test(groups = {  "sanitytest", "smoke" }, priority = 16, enabled=true)
	public void agendaScreen() {
		
		logger.info("Executing 'agendaScreen' test case");
		loginObj.loginTest();
		agendaScreenObj.agendaScreenVerify();
		
	}
	
	@Test(groups = {  "sanitytest", "smoke"  }, priority = 17, enabled=true)
	public void tabsofAgendaScreen() {
		
		logger.info("Executing 'tabsofAgendaScreen' test case");
		loginObj.loginTest();
		agendaScreenObj.tabsofAgendaScreen();
		
	}
	
	@Test(groups = {  "sanitytest"  }, priority = 18, enabled=true)
	public void createTaskOnAgendaScreen() {
		
		logger.info("Executing 'createTaskOnAgendaScreen' test case");
		loginObj.loginTest();
		agendaScreenObj.createTaskonAgendaScreen();	
	}
	
	@Test(groups = {  "sanitytest"  }, priority = 19, enabled=true)
	public void openAndEditTaskOnAgendaScreen() {
		
		logger.info("Executing 'openAndEditTaskOnAgendaScreen' test case");
		loginObj.loginTest();
		agendaScreenObj.openAndEditTaskonAgendaScreen();	
	}
	
	@Test(groups = {  "sanitytest"  }, priority = 20, enabled=true)
	public void markAsCompleteTaskonAgendaScreen() {
		
		logger.info("Executing 'markAsCompleteTaskonAgendaScreen'  test case");
		loginObj.loginTest();
		agendaScreenObj.markAsCompleteTaskOnAgendaScreen();	
	}
	
	
	@Test(groups = {  "sanitytest", "smoke"  }, priority = 21, enabled=true)
	public void pipelineView() {
		
		logger.info("Executing 'pipelineView' test case");	
		loginObj.loginTest();
		pipelineViewObj.pipelineViewVerify();

	}
	
	@Test(groups = {  "sanitytest"  }, priority = 22, enabled=true)
	public void accountNeedingAttention() {
		
		logger.info("Executing 'accountNeedingAttention' test case");	
		loginObj.loginTest();
		accountNeedingObj.accountNeedingAttentionVerify();
		
	}
	
		
	@Test(groups = {  "sanitytest"  }, priority = 23, enabled=true)
	public void planforToday() {
		
		logger.info("Executing 'planforToday' test case");	
		loginObj.loginTest();
		planForTodayObj.planForTodayverify();
		
	}
	
	@Test(groups = {  "sanitytest"  }, priority = 24, enabled=true)
	public void latestInsights() {
		
		logger.info("Executing 'latestInsights' test case");	
		loginObj.loginTest();
		latestInsightsObj.latestInsightVerify();
		
	}
	
	@Test(groups = {  "sanitytest", "smoke"  }, priority = 25, enabled=true)
	public void dealsOfTheWeek() {
		
		logger.info("Executing 'dealsOfTheWeek' test case");
		loginObj.loginTest();
		dealsOfWeekObj.dealsOfWeekVerify();
		
	}
	
	@Test(groups = {  "sanitytest", "smoke"  }, priority = 26, enabled=true)
	public void supportRequest() {
		
		logger.info("Executing 'supportRequest' test case");
		loginObj.loginTest();
		supportRequestObj.supportRequestverify();
		
	}
	
}
