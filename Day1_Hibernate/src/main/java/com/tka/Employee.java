package com.tka;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // --> automatically generate table
@Table(name = "empData") // provide name for table
public class Employee {

	@Id // mark as primary key
	int empId;
	String empName;
	String city;
	String salary;

	public Employee() {

	}

	public Employee(int empId, String empName, String city, String salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.city = city;
		this.salary = salary;
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

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", city=" + city + ", salary=" + salary + "]";
	}

}
