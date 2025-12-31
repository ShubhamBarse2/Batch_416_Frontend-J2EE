package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Laptop {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int laptopId;
	String lName;

	public Laptop() {

	}

	public Laptop(int laptopId, String lName) {
		super();
		this.laptopId = laptopId;
		this.lName = lName;
	}

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", lName=" + lName + "]";
	}

}
