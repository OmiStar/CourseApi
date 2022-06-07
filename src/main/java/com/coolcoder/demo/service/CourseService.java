package com.coolcoder.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coolcoder.demo.entity.Courses;
import com.coolcoder.demo.repository.CourseRepo;

@Service
public class CourseService {

	@Autowired
	CourseRepo repo;
	
	public Courses saveCourse(Courses courses) {
		return repo.save(courses);
	}
	
	public List<Courses> saveCourses(List<Courses> courses) {
		return repo.saveAll(courses);
	}
	
	public List<Courses> getCourse(){
		return repo.findAll();
	}
	public Courses getCourseById(int id){
		return repo.findById(id).orElse(null);
	}
	public Courses getCourseByName(String name){
		return repo.findByName(name);
	}
	
	public String deleteCourse(int id) {
		repo.deleteById(id);
		return "Course Removed  !!" +id;
	}
	
	public Courses updatecourse(Courses courses) {
		Courses  exsistingCourse=repo.findById(courses.getId()).orElse(null);
		exsistingCourse.setName(courses.getName());
		exsistingCourse.setDescp(courses.getDescp());
		exsistingCourse.setPrice(courses.getPrice());
		return repo.save(exsistingCourse);
		

	}
	
	
}
