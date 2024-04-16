package com.excelr.basics.corejava.collections.map.enummap;

import java.util.EnumMap;
import java.util.Map;

enum Day{
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
public class EnumMapExample {

	public static void main(String[] args) {
		EnumMap<Day, String> schedule = new EnumMap<>(Day.class);
		
		schedule.put(Day.MONDAY, "Meeting");
		schedule.put(Day.TUESDAY, "Playing");
		schedule.put(Day.WEDNESDAY, "Gymming");

		System.out.println("EnumMap Contents: ");
		for(Map.Entry<Day, String> entry : schedule.entrySet())
		{
			System.out.println(entry.getKey()+"-->"+entry.getValue());
		}
		
		String wednesdayActivity = schedule.get(Day.WEDNESDAY);
		System.out.println("Wesnesday's Activity: "+ wednesdayActivity);
	}
}
