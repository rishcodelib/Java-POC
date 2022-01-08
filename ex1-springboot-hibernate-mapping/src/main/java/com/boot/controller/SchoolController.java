package com.boot.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.School;
import com.boot.model.Teacher;
import com.boot.repository.SchoolRepository;

@RestController
public class SchoolController {

	@Autowired
	SchoolRepository myschool;

	@PostMapping("/school")
	@ResponseBody
	public void addSchool(School school) {
		myschool.save(school);
	}
}