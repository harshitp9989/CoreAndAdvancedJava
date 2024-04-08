package com.excelr.basics.corejava.collections.list.sort.comparable;

public class Account implements Comparable<Account>{

	private int id;
	private String name;
	private String organization;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	
	@Override
	public String toString() {
		return "Accounts [id=" + id + ", name=" + name + ", organization=" + organization + "]";
	}
	
	@Override
	public int compareTo(Account account) {
		return this.id - account.getId();
	}
	
	
	
}
