package com.tka.SpringBootDay1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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

	@DeleteMapping("/delete/{id}")
	public String deleteData(@PathVariable int id) {
		String msg = service.deleteData(id);
		return msg;
	}

	@PutMapping("/update/{id}")
	public String updateData(@RequestBody Student s, @PathVariable int id) {
		String msg = service.updateData(s, id);
		return msg;
	}

	@GetMapping("/getsingleresult")
	public Student getParticularData(@RequestParam int id) {
		Student s = service.getParticularData(id);
		return s;
	}

	@GetMapping("/getAllRecord")
	public List<Student> getAllRecord() {
		List<Student> list = service.getAllData();
		return list;
	}

}
