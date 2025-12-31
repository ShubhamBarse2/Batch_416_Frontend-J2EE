package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Student {

	@Id
	int studId;
	String name;
	String city;
	
	@OneToOne
	@JoinColumn(name = "LmodelNo")
	Laptop l;

	public Student() {

	}

	public Student(int studId, String name, String city, Laptop l) {
		super();
		this.studId = studId;
		this.name = name;
		this.city = city;
		this.l = l;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Laptop getL() {
		return l;
	}

	public void setL(Laptop l) {
		this.l = l;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", name=" + name + ", city=" + city + ", l=" + l + "]";
	}

}
