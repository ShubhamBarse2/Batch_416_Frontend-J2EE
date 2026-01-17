package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.ConfigClass;
import com.entity.Employee;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
		Employee e = context.getBean(Employee.class);
		Employee e1 = context.getBean(Employee.class);
		System.out.println(e.hashCode());
		System.out.println(e1.hashCode());
		System.out.println(e == e1);
	}
}
