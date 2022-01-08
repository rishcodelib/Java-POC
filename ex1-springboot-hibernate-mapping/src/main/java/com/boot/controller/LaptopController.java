package com.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.Laptop;
import com.boot.repository.LaptopRepo;

@RestController("/laptop")
public class LaptopController {

	@Autowired
	LaptopRepo lapi;
	
	public void addLaptop(Laptop laptop) {
		lapi.save(laptop);
	}
}
