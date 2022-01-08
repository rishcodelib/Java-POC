package com.boot.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.Student;
import com.boot.model.Teacher;
import com.boot.repository.TeacherRepo;

@RestController
public class TeacherController {

	@Autowired
	TeacherRepo teach;

	@PostMapping("/teacher")
	
	public void addTeacher(@RequestBody Teacher teacher, @RequestBody Set<Student> std) {
		teacher.setStudent(std);
		teach.save(teacher);
	}

}
