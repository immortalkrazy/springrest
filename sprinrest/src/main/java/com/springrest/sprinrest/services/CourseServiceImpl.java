package com.springrest.sprinrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.sprinrest.Dao.CourseDao;
import com.springrest.sprinrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;

//	List<Course> list;

	public CourseServiceImpl() {

//		list = new ArrayList<>();
//		list.add(new Course(145, "Java", "Java Basics"));
//		list.add(new Course(150, "Python", "Python Course"));
//		list.add(new Course(250, "Spring", "Springboot Course"));

	}

	@Override
	public List<Course> getCourses() {

		return courseDao.findAll();
		// return list;
	}

	@Override
	public Course getCourse(long courseId) {

		return courseDao.getById(courseId);
//		Course course = null;
//		for (Course c : list) {
//			if (c.getId() == courseId) {
//				course = c;
//				break;
//			}
//		}
//		return course;

	}

	@Override
	public Course addCourse(Course course) {

		courseDao.save(course);
		return course;
//		list.add(course);
//		return course;
	}

	@Override
	public Course updateCourse(Course course) {

		courseDao.save(course);
		return course;
//		for (Course c : list) {
//			if (c.getId() == course.getId()) {
//				c.setTitle(course.getTitle());
//				c.setDescription(course.getDescription());
//				break;
//			}
//		}
//		return course;

	}

	@Override
	public void deleteCourse(long parseLong) {

		Course entity = courseDao.getById(parseLong);
		courseDao.delete(entity);
//		list = this.list.stream().filter(e -> e.getId() != parseLong).collect(Collectors.toList());

	}
}
