package com.boot.model;

import java.util.ArrayList;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import antlr.collections.List;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollno;
	
	private String name;
	
	private int marks;
//	@OneToMany(mappedBy = "laptop")
//	private Set<Laptop> laptop;
	
	@OneToOne
	private Laptop laptop;

	
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	

//	-----
	public int getRollno() {
		return rollno;
	}

//	public Set<Laptop> getLaptop() {
//		return laptop;
//	}
//
//	public void setLaptop(Set<Laptop> laptop) {
//		this.laptop = laptop;
//	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}
