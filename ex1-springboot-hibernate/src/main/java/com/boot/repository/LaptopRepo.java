package com.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.model.Laptop;
import com.boot.model.Student;

@Repository
public interface LaptopRepo extends JpaRepository<Laptop, Integer> {



}
