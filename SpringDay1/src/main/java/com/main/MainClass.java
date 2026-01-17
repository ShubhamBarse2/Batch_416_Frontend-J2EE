package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Employee;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		Employee e1 = context.getBean("emp", Employee.class);
//		e1.setEmpId(123);
//		e1.setCity("pune");
//		e1.setName("rahul");
		System.out.println(e1);

	}
}
