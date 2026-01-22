package com.tka.SpringBootDay1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.SpringBootDay1.entity.Student;
import com.tka.SpringBootDay1.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService service;

	@PostMapping("/register")
	public String insertData(@RequestBody Student s) {
		String msg = service.insertData(s);
		return msg;
	}

}
