package com.excelr.basics.corejava.collections.list.sort.comparator;

import java.util.Comparator;

public class Account  implements Comparator<Account>{

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
	public int compare(Account account1, Account account2) {
		return account1.getId() - account2.getId();
	}
}
