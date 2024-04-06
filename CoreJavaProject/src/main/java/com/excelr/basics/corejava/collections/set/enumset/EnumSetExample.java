package com.excelr.basics.corejava.collections.set.enumset;

import java.util.EnumSet;

enum Days{
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}


public class EnumSetExample {

	public static void main(String[] args) {
		EnumSet<Days> weekdays = EnumSet.allOf(Days.class);
		System.out.println("WeekDays:"+weekdays);
		
		EnumSet<Days> workingDays = EnumSet.range(Days.MONDAY, Days.FRIDAY);
		System.out.println("workingDays:"+workingDays);
		
		EnumSet<Days> weekend = EnumSet.of(Days.SATURDAY, Days.SUNDAY);
		System.out.println("weekend:"+weekend);
		
		EnumSet<Days> emptyDays = EnumSet.noneOf(Days.class);
		System.out.println("weekend:"+weekend);
		
		EnumSet<Days> copyOfWeekdays = EnumSet.copyOf(weekdays);
		System.out.println("copyOfWeekdays:"+copyOfWeekdays);
	}

}
