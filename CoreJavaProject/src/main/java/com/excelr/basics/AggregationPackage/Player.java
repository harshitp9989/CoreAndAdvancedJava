package com.excelr.basics.AggregationPackage;

public class Player {
	private String playerName;
	private String playerPosition;
	
	public Player(String playerName, String playerPosition)
	{
		this.playerName = playerName;
		this.playerPosition = playerPosition;
	}
	
	public void displayPlayerDetails()
	{
		System.out.println("Player Name"+ playerName);
		System.out.println("Player Position"+ playerPosition);
	}
	
	@Override
	protected void finalize() throws Throwable{
		System.out.println("Player distroyed ...");
	}
}
