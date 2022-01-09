package com.boot.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity

public class School {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int SchoolId;

	private String SchoolName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name= "schoolId")
	private List<Teacher> teacher;
	
	public int getSchoolId() {
		return SchoolId;
	}

	public void setSchoolId(int schoolId) {
		SchoolId = schoolId;
	}

	public String getSchoolName() {
		return SchoolName;
	}

	public void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}

	public List<Teacher> getTeacher() {
		return teacher;
	}

	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}

	public School(int schoolId, String schoolName, List<Teacher> teacher) {
		super();
		SchoolId = schoolId;
		SchoolName = schoolName;
		this.teacher = teacher;
	}

	public School() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
