package com.tka.SpringBootDay1.service;

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
		return msg;
	}
}
