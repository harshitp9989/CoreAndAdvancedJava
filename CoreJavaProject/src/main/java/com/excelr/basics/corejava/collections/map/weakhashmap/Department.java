package com.excelr.basics.corejava.collections.map.weakhashmap;

public class Department {

	String deptName;
	String locationName;
	
	public Department(String deptName, String locationName) {
		this.deptName = deptName;
		this.locationName = locationName;
	}

	@Override
	public String toString() {
		return "Department [deptName=" + deptName + ", locationName=" + locationName + "]";
	}
	
	
}
