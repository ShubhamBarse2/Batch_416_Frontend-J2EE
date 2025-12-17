package com.entities;

public class Student { // POJO -> Plane old java Object

//	1> fields 
//	2> public getr & setr
//	3> No args Constr 
//	4> Args Constrs
//	5> toString 

	int id;
	String name;
	String city;

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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Student() {

	}

	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	

}
