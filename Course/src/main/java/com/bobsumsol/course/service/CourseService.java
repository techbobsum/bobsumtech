package com.bobsumsol.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bobsumsol.course.model.Course;
import com.bobsumsol.course.repository.CourseRepository;

import java.util.List;

@Service
public class CourseService {
	@Autowired
	private CourseRepository crepo;
	
	public Course saveCourse(Course course) {
		return crepo.save(course);
	}
	public List<Course> saveCourses(List<Course> courses){
		return crepo.saveAll(courses);
	}
	
	public List<Course> getCourse() {
		return crepo.findAll();
	}
	
	public Course getCourseById(int id) {
		return crepo.findById(id).orElse(null);
	}
	
	public Course getCourseByName(String name) {
		return crepo.findByName(name).orElse(null);
	}
	
	public String deleteCourseById(int id) {
		crepo.deleteById(id);
		return "Course " + id + " is deleted";
	}
	
	public Course updateCourse(Course course) {
		Course existingCourse = crepo.findById(course.getId()).orElse(null);
		existingCourse.setName(course.getName());
		existingCourse.setDuration(course.getDuration());
		existingCourse.setStartingDay(course.getStartingDay());
		existingCourse.setPrice(course.getPrice());
		existingCourse.setLecturer(course.getLecturer());
		return crepo.save(existingCourse);
	}
}
