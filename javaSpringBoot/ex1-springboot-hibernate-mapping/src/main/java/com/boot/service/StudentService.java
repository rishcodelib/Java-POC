package com.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.model.Laptop;
import com.boot.model.Student;
import com.boot.repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	StudentRepo sRepo;

	public void addnew(Student std, Laptop lapi) {

		std.setLaptop(lapi);

		sRepo.save(std);
	}
}
