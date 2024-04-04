package com.excelr.basics.AggregationPackage;

public class AggregationTeamMain {

	public static void main(String[] args) {
		Player player = new Player("John", "Forward");
		
		Team team = new Team("Team A", "Coach xx", player);
		
		team.displayTeamDetails();
		
		team =null;
		System.gc();
	}
}
