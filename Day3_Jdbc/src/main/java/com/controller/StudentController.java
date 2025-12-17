package com.controller;

import java.util.Scanner;

import com.entities.Student;
import com.service.StudentService;

public class StudentController {

	public void insertData(Student s) throws Exception {
		StudentService ss = new StudentService();
		ss.insertData(s);
	}

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter ur ID here..!");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter ur Name here..!");
		String name = sc.nextLine();

		System.out.println("Enter ur City here..!");
		String city = sc.nextLine();

		Student s = new Student(id, name, city);
		StudentController ss = new StudentController();
		ss.insertData(s);

	}

}
