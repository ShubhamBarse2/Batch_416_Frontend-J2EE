package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Employee;

public class EmployeeDao {

	public void insertData() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Employee e = new Employee();
		e.setEmpName("mangesh");
		e.setCity("goa");
		e.setSalary("32LPA");
		;
		e.setEmail("mangesh@gmail.com");

//		ss.save(e);
		ss.persist(e);

		tr.commit();
		ss.close();
		System.out.println("Data is Inserted ... !");
	}

	public void deleteData() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int id = 126;
		Employee e = ss.get(Employee.class, id);

//		ss.delete(e);
		ss.remove(e);

		tr.commit();
		ss.close();

		System.out.println("Data is Deleted... ! ");

	}

	public void updateData() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int id = 124;
		Employee e = ss.load(Employee.class, id);

		e.setCity("nagpur");
		e.setEmpName("raj");
		e.setSalary("48LPA");

//		ss.update(e);
		ss.merge(e);
		System.out.println("Data is updated..");
		tr.commit();
		ss.close();

	}

	public void getAllData() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		// sql query for fetch all data - select * from empdata;

		// hql Query -> from Employee

		String hqlQuery = "from Employee";

		Query<Employee> query = ss.createQuery(hqlQuery, Employee.class);
		List<Employee> list = query.list();

		for (Employee employee : list) {
			System.out.println(employee);
		}

		tr.commit();
		ss.close();

	}

	public void getSingleRecord() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "from Employee where id =: id";

		Query<Employee> query = ss.createQuery(hqlQuery);
		query.setParameter("id", 3);
		query.executeUpdate();
//
		Employee e = query.uniqueResult();
		System.out.println(e);

		tr.commit();
		ss.close();

	}
}
