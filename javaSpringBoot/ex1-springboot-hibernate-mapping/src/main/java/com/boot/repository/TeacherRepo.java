package com.boot.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.model.Teacher;

public interface TeacherRepo extends JpaRepository<Teacher, Integer> {

	void save(ArrayList<Teacher> teacher);

}
