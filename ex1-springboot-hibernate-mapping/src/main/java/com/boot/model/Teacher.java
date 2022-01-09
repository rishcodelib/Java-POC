package com.boot.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int teacherId;

	private String teacherName;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private School school;

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public Teacher(int teacherId, String teacherName, School school) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.school = school;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

}
