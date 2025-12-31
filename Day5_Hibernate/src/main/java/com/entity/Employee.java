package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee { // Many

	@Id
	int empId;
	String name;

	@ManyToOne
	Department d;

	public Employee(int empId, String name, Department d) {
		super();
		this.empId = empId;
		this.name = name;
		this.d = d;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	public Department getD() {
		return d;
	}

	public void setD(Department d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", d=" + d + "]";
	}

}
