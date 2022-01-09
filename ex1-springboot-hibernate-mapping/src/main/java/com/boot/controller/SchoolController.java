package com.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.School;
import com.boot.service.SchoolService;

@RestController
public class SchoolController {

	@Autowired
	SchoolService myschool;
	
	@PostMapping("/school")
	public void addSchool(@RequestBody School school) {
//		myschool.addSchool(school);
		myschool.addteacher(school);
	}
	
	
}