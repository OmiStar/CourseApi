package com.coolcoder.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coolcoder.demo.entity.Courses;
import com.coolcoder.demo.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	CourseService service;
	
	@PostMapping("/add")
	public Courses addOneCourse(@RequestBody Courses courses) {
		return service.saveCourse(courses);
	}
	@PostMapping("/addAll")
	public List<Courses> addOneCourse(@RequestBody List<Courses> allcourses) {
		return service.saveCourses(allcourses);
	}
	
	@GetMapping("/courses")
	public List<Courses> findAllCourse(){
		return service.getCourse();
	}
	@GetMapping("/courseById/{id}")
	public Courses getCourseById(@PathVariable int id) {
		return service.getCourseById(id);
	}
	@GetMapping("/courseByName/{name}")
	public Courses getCourseByName(@PathVariable String name) {
		return service.getCourseByName(name);
	}
	@PutMapping("/update")
	public Courses updateCourse(@RequestBody Courses courses) {
		return service.updatecourse(courses);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteCourse(@PathVariable int id) {
		return service.deleteCourse(id);
	}
	
}
