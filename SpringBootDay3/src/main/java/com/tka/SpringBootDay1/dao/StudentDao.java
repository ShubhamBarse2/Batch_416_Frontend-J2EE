package com.tka.SpringBootDay1.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.SpringBootDay1.entity.Student;

@Repository
public class StudentDao {

	@Autowired
	SessionFactory factory;

	public String inserData(Student s) {

		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		session.persist(s);
		tr.commit();
		session.close();

		return "Data is inserted... !";
	}

}
