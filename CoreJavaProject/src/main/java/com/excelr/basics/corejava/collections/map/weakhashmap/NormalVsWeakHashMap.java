package com.excelr.basics.corejava.collections.map.weakhashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class NormalVsWeakHashMap {

	public static void main(String[] args) {
		NormalVsWeakHashMap.NormalHashMapFunction();
		System.out.println("--------------");
		NormalVsWeakHashMap.WeakHashMapFunction();
	}
	
	public static void NormalHashMapFunction()
	{
		Student s1 =  new Student(1,"Harshit");
		Student s2 =  new Student(12,"Hanisha");
		Student s3 =  new Student(111,"Harry");

		Department d1 = new Department("Cse", "Los Angeles");
		Department d2 = new Department("Bio Tech", "Vizag");
		Department d3 = new Department("Mechanical", "Los Angeles");

		Map<Student, Department> hashMap1 = new HashMap<>();
		hashMap1.put(s1,d1);
		hashMap1.put(s2,d2);
		hashMap1.put(s3,d3);
		
		for(Map.Entry<Student, Department> kk : hashMap1.entrySet())
		{
			System.out.println(kk.getKey() + "-->"+kk.getValue());
		}
		System.out.println(hashMap1.size());
		
		s1 = null;
		s2 = null;
		s3 = null;
		
		System.out.println("Calling GC on normal HashMap...");
		System.gc();
		try {
			System.out.println("Cleaning up....\nPlease wait...");
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		for(Map.Entry<Student, Department> kk : hashMap1.entrySet())
		{
			System.out.println(kk.getKey() + "-->"+kk.getValue());
		}
		System.out.println(hashMap1.size());
	}
	
	public static void WeakHashMapFunction()
	{
		Student s1 =  new Student(1,"Harshit");
		Student s2 =  new Student(12,"Hanisha");
		Student s3 =  new Student(111,"Harry");

		Department d1 = new Department("Cse", "Los Angeles");
		Department d2 = new Department("Bio Tech", "Vizag");
		Department d3 = new Department("Mechanical", "Los Angeles");

		Map<Student, Department> hashMap1 = new WeakHashMap<>();
		hashMap1.put(s1,d1);
		hashMap1.put(s2,d2);
		hashMap1.put(s3,d3);
		
		for(Map.Entry<Student, Department> kk : hashMap1.entrySet())
		{
			System.out.println(kk.getKey() + "-->"+kk.getValue());
		}
		System.out.println(hashMap1.size());
		
		s1 = null;
		s2 = null;
		s3 = null;
		
		System.out.println("Calling GC on weak HashMap...");
		System.gc();
		try {
			System.out.println("Cleaning up....\nPlease wait...");
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		for(Map.Entry<Student, Department> kk : hashMap1.entrySet())
		{
			System.out.println(kk.getKey() + "-->"+kk.getValue());
		}
		System.out.println(hashMap1.size());
	}
}
