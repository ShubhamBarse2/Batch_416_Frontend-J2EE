package com.tka;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Employee e = new Employee();
		e.setEmpId(125);
		e.setEmpName("sunil");
		e.setCity("nsk");
		e.setSalary("12LPA");

//		ss.save(e);
		ss.persist(e);

		tr.commit();
		ss.close();
		System.out.println("Data is Inserted ... !");
	}

}
