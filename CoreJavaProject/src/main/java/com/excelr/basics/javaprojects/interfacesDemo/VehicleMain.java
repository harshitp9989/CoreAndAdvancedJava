package com.excelr.basics.javaprojects.interfacesDemo;

public class VehicleMain {
	public static void main(String[] args) {
		Vehicle nano = new Nano();
		nano.engine();
		
		Vehicle scorpio = new Scorpio();
		scorpio.engine();
		
		nano.drivers();
		Vehicle.battery();
	}
}
