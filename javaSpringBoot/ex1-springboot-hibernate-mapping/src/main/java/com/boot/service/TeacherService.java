package com.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.model.Student;
import com.boot.model.Teacher;
import com.boot.repository.TeacherRepo;

@Service
public class TeacherService {

	@Autowired
	TeacherRepo teach;

	public void add(Teacher teacher) {

		teach.save(teacher);

	}

	public void addTeacherStudent(Teacher teacher, Student std) {
		System.out.println(std);
		System.out.println(teacher);
		teach.save(teacher);

	}

}
