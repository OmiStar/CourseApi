package com.coolcoder.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coolcoder.demo.entity.Courses;

public interface CourseRepo extends JpaRepository<Courses, Integer>{

	Courses findByName(String name);

}
