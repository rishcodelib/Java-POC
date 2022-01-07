package com.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.Laptop;
import com.boot.model.Student;
import com.boot.repository.LaptopRepo;
import com.boot.repository.StudentRepo;

@RestController
public class StudentController {

	@Autowired
	StudentRepo sRepo;

	@Autowired
	LaptopRepo lRepo;
	
	@PostMapping("/student")
	@ResponseBody
	public void addStudent(Student std, Laptop lapi) {
		sRepo.save(std);
		lRepo.save(lapi);
	}

}
