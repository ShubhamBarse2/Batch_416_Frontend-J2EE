package com.service;

import com.dao.StudentDao;
import com.entities.Student;

public class StudentService {

	public void insertData(Student s) throws Exception {
		StudentDao sd = new StudentDao();
		sd.insertData(s);
	}

}
