package com.boot.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.model.School;
import com.boot.model.Teacher;
import com.boot.repository.SchoolRepository;

@Service
public class SchoolService {

	@Autowired
	SchoolRepository srepo;

	public void addSchool(School skl) {

		srepo.save(skl);

	}

	public void addteacher(School school) {
//		ArrayList<Teacher> l = new ArrayList<Teacher>();
	
		srepo.save(school);

	}

}
