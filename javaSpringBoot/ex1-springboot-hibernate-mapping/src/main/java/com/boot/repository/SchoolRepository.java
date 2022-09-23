package com.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.model.School;

public interface SchoolRepository extends JpaRepository<School, Integer> {

}
