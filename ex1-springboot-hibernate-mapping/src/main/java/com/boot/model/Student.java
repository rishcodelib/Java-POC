package com.boot.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollno;

	private String StudentName;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "laptop_id")
	private Laptop laptop;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Teacher> teacher;

	@OneToMany
	@JoinColumn(name = "S_id")
	private Set<School> school;

	public Student(int rollno, String studentName, Laptop laptop, List<Teacher> teacher, Set<School> school) {
		super();
		this.rollno = rollno;
		StudentName = studentName;
		this.laptop = laptop;
		this.teacher = teacher;
		this.school = school;
	}

	public Student() {
		super();
	}

	public List<Teacher> getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teach) {
		this.teacher = (List<Teacher>) teach;
	}

	public Set<School> getSchool() {
		return school;
	}

	public void setSchool(Set<School> school) {
		this.school = school;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

}
