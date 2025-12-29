package com.service;

import com.dao.EmployeeDao;

public class EmployeeService {

	public void insertData() {
		EmployeeDao dao = new EmployeeDao();
		dao.insertData();
	}

	public void deleteData() {
		EmployeeDao dao = new EmployeeDao();
		dao.deleteData();
	}

	public void updateData() {
		EmployeeDao dao = new EmployeeDao();
		dao.updateData();
		
	}

}
