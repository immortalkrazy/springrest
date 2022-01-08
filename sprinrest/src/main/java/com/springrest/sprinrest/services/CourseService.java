package com.springrest.sprinrest.services;

import java.util.List;

import com.springrest.sprinrest.entities.Course;

public interface CourseService {

	public List<Course> getCourses();

	public Course getCourse(long courseId);

	public Course addCourse(Course course);

	public Course updateCourse(Course course);

	public void deleteCourse(long courseId);
}
