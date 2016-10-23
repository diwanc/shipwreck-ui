package com.vmware.salespulse.models;

public class SalespulsePojo 
{
	public String dashboardHeader;
	public String insightBottom;
	public String accountsBottom;
	public String discussionsBottom;
	public String agendaBottom;
	public String achievedText;
	public String accountNeedingAttentionText;
	public String supportRequestText;
	public String planForTodayText;
	public String dealsOftheWeekText;
	public String latestInsightsText = "Latest Insights";
	
	public SalespulsePojo()
	{
		super();
		this.dashboardHeader = "Dashboard";
		this.insightBottom = "Insights";
		this.accountsBottom = "Accounts";
		this.discussionsBottom = "Discussions";
		this.agendaBottom = "Agenda";
		this.achievedText = "Achieved  / Goal";
		this.accountNeedingAttentionText = "Accounts Needing Attention";
		this.supportRequestText = "Support Request";
		this.planForTodayText = "Plan for Today";
		this.dealsOftheWeekText = "Deals of the Week";
		this.latestInsightsText = "Latest Insights";
	}
}
