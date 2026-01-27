package com.tka.SpringBootDay1.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
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

	public String deleteData(int id) {

		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		Student std = session.get(Student.class, id);

		session.remove(std);

		tr.commit();
		session.close();

		return "Data is deleted... !";
	}

	public String updateData(Student std, int id) {

		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		Student s = session.get(Student.class, id);
		s.setName(std.getName());
		s.setAge(std.getAge());
		s.setCity(std.getCity());

		session.merge(s);

		tr.commit();
		session.close();

		return "Data is updated... !";
	}

	public Student getParticularData(int id) {

		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();

		String hqlQuery = "from Student where id =: id";
		Query<Student> query = session.createQuery(hqlQuery);
		query.setParameter("id", id);

		Student s = query.getSingleResult();

		tr.commit();
		session.close();

		return s;
	}

	public List<Student> getAllData() {

		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();

		String hqlQuery = "from Student";

		Query<Student> query = session.createQuery(hqlQuery);
		List<Student> list = query.getResultList();

		tr.commit();
		session.close();

		return list;
	}
}
