package com.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.Teacher;
import com.boot.service.TeacherService;

@RestController
public class TeacherController {

	@Autowired
	TeacherService teach;

	@PostMapping("/teacher")
	public void addTeacher(@RequestBody Teacher teacher) {
		teach.add(teacher);
	}

	@PostMapping("/teach/{Studentname}")
	public void addTeacherStudent(@RequestBody Teacher teacher) {
		teach.add(teacher);

	}

}
