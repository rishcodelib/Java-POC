package com.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.Laptop;
import com.boot.model.Student;
import com.boot.service.StudentService;

@RestController

public class StudentController {

	@Autowired
	StudentService sService;

	@PostMapping("/student")
	public void addStudent(@RequestBody Student std, Laptop laptop) {
			
		sService.addnew(std,laptop);

	}

}
