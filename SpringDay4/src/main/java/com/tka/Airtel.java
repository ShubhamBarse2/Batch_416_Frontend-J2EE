package com.tka;

import org.springframework.stereotype.Component;

@Component("air")
public class Airtel implements Sim {

	@Override
	public String getCalling() {
		return "U R calling from Airtel";
	}
}
