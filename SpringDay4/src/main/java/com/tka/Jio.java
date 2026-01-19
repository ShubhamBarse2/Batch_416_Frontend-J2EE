package com.tka;

import org.springframework.stereotype.Component;

@Component("jio")
public class Jio implements Sim {

	@Override
	public String getCalling() {
		return "U R calling from jio";
	}

}
