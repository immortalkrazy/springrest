package com.springrest.sprinrest.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.sprinrest.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long> {

}
