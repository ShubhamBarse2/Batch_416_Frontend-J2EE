package com.entity;

public class Company {

	int cId;
	String name;
	Employee emp;

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Company(int cId, String name, Employee emp) {
		super();
		this.cId = cId;
		this.name = name;
		this.emp = emp;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Company [cId=" + cId + ", name=" + name + ", emp=" + emp + "]";
	}

}
