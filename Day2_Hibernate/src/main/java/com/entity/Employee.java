package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // --> automatically generate table
@Table(name = "empData") // provide name for table
public class Employee {

	@Id // mark as primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int empId;
	String empName;
	@Column(name = "address")
	String city;
	String salary;
	@Column(unique = true)
	String email;

	public Employee() {

	}

	public Employee(int empId, String empName, String city, String salary, String email) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.city = city;
		this.salary = salary;
		this.email = email;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", city=" + city + ", salary=" + salary
				+ ", email=" + email + "]";
	}

}
