package com.excelr.basics.AggregationPackage;

public class Team {
	private String teamName;
	private String coachName;
	private Player player;
	
	
	public Team(String teamName, String coachName, Player player)
	{
		this.teamName = teamName;
		this.coachName = coachName;
		this.player = player;
	}
	
	public void displayTeamDetails() {
		System.out.println("Team Name"+ teamName);
		System.out.println("Coach Name"+ coachName);
		
		System.out.println("pLAYER IN THE TEAM:");
		player.displayPlayerDetails();
	}
	
	@Override
	protected void finalize() throws Throwable{
		System.out.println("Team distroyed ....but player is not distroyed");
	}
}
