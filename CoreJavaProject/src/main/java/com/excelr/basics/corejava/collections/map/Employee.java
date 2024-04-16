package com.excelr.basics.corejava.collections.map;

import java.util.Objects;

public class Employee {

	private int empId;
	private String name;
	private String Organization;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrganization() {
		return Organization;
	}
	public void setOrganization(String organization) {
		Organization = organization;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", Organization=" + Organization + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Organization, empId, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(Organization, other.Organization) && empId == other.empId
				&& Objects.equals(name, other.name);
	}
	
}
