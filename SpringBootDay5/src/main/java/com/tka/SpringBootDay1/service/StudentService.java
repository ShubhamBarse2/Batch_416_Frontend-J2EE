package com.tka.SpringBootDay1.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.SpringBootDay1.dao.StudentDao;
import com.tka.SpringBootDay1.entity.Student;

@Service
public class StudentService {

	@Autowired
	StudentDao dao;

	public String insertData(Student s) {
		String msg = dao.inserData(s);
		if (Objects.isNull(msg)) {
			msg = "Data is not inserted... ! ";
		}
		return msg;
	}

	public String deleteData(int id) {
		String msg = dao.deleteData(id);
		return msg;
	}

	public String updateData(Student s, int id) {
		String msg = dao.updateData(s, id);
		return msg;
	}

	public Student getParticularData(int id) {
		Student s = dao.getParticularData(id);
		return s;
	}

	public List<Student> getAllData() {
		List<Student> list = dao.getAllData();
		return list;
	}
}
