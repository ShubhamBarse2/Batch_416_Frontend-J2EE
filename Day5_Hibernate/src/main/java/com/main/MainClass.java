package com.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Department;
import com.entity.Employee;

public class MainClass {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		cfg.addAnnotatedClass(Department.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Department d = new Department();
		d.setDeptName("java dev.");

		Employee e1 = new Employee();
		e1.setEmpId(1001);
		e1.setName("pranit");
		e1.setD(d);

		Employee e2 = new Employee();
		e2.setEmpId(1002);
		e2.setName("Aniket");
		e2.setD(d);

		Employee e3 = new Employee();
		e3.setEmpId(1003);
		e3.setName("yash");
		e3.setD(d);

		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);

		d.setEmp(list);

		ss.persist(d);
		ss.persist(e1);
		ss.persist(e2);
		ss.persist(e3);

		System.out.println("Data is Inserted ... !");

		tr.commit();
		ss.close();

	}

}