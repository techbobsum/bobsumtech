package com.bobsumsol.course.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bobsumsol.course.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

	Optional<Course> findByName(String name);
	

}
