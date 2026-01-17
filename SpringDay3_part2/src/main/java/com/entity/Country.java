package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Country {

	@Value("+91")
	int con_Id;
	@Value("IND")
	String name;

	@Autowired
	Employee emp;

	public int getCon_Id() {
		return con_Id;
	}

	public void setCon_Id(int con_Id) {
		this.con_Id = con_Id;
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

	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Country(int con_Id, String name, Employee emp) {
		super();
		this.con_Id = con_Id;
		this.name = name;
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Country [con_Id=" + con_Id + ", name=" + name + ", emp=" + emp + "]";
	}

}
