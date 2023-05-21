package com.restapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.dao.CourseDao;
import com.restapi.entities.Course;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	private CourseDao courseDao;
	
	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
		Course entity= courseDao.findById(courseId);
		return entity;
	}

	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
	   return courseDao.save(course);
		
	}

	@Override
	public void deleteCourse(long courseId) {
		Course entity=courseDao.findById(courseId);
		courseDao.delete(entity);
	}

	
}
