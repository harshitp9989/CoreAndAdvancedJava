package com.excelr.basics.corejava.collections.map.treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapConstructorExample {

	public static void main(String[] args) {
		
		Map<String, Integer> defaultTreeMap = new TreeMap<>();
		defaultTreeMap.put("Alpha1", 55);
		defaultTreeMap.put("Beta2", 77);
		defaultTreeMap.put("Gama3", 88);
		
		Comparator<String> reverseComparator = Comparator.reverseOrder();
		Map<String, Integer> ComparatorTreeMap = new TreeMap<>(reverseComparator);
		ComparatorTreeMap.put("Alpha1", 55);
		ComparatorTreeMap.put("Beta2", 77);
		ComparatorTreeMap.put("Gama3", 88);
		
		Map<String, Integer> copyTreeMap = new TreeMap<>(defaultTreeMap);
		
		displayContents(defaultTreeMap);
		displayContents(ComparatorTreeMap);
		displayContents(copyTreeMap);
	}
	
	public static void displayContents(Map<String, Integer> treeMap1)
	{
		System.out.println("Displaying contents of TreeMap...");
		for(Map.Entry<String, Integer> xx : treeMap1.entrySet())
		{
			System.out.println(xx.getKey()+ "-->"+xx.getValue());
		}
		System.out.println();
	}
}
