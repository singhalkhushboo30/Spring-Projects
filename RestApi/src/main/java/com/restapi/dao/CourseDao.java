package com.restapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi.entities.Course;

@Repository
public interface CourseDao extends JpaRepository<Course,Long>{

	
	

}
