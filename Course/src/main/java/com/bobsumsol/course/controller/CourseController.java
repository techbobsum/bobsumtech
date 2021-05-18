package com.bobsumsol.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.bobsumsol.course.model.Course;
import com.bobsumsol.course.service.CourseService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@Controller
public class CourseController {
	@Autowired
	private CourseService cservice;
	
	@GetMapping("/course/{id}")
	public Course getCourse(@PathVariable Integer id) {
		return cservice.getCourseById(id);
	}
	
	@GetMapping("/course/{name}")
	public Course getCourse(@PathVariable String name) {
		return cservice.getCourseByName(name);
	}
	@PostMapping("/addCourse")
	public Course addCourse(@RequestBody Course course){
		return cservice.saveCourse(course);
		
	}
	@PostMapping("/addCourses")
	public List<Course> addCourses(@RequestBody List<Course> courses){
		return cservice.saveCourses(courses);
	}
	@PutMapping("/update/{id}")
	public Course updateContact(@RequestBody Course course) {
		return cservice.updateCourse(course);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteCourse(@PathVariable Integer id) {
		return cservice.deleteCourseById(id);
	}
	

}
