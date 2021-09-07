package com.techment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dao.ICourseDao;
import com.techment.entity.Courses;

@Service
public class CourseServiceImplm implements ICourseService {

	@Autowired
	ICourseDao dao;
	
	/*************List All the courses****************/
	
	@Override
	public List<Courses> listAllCourses() {
		return dao.findAll();
	}

	/*************Save All the courses****************/
	
	@Override
	public String saveCourses(Courses course) {
		dao.save(course);
		return "Courses are saved";
	}

	/**********Find All courses for given Id**********/
	
	@Override
	public Courses getCoursesById(int id) {
		return dao.findById(id).get();
	}

	/**********Delete All courses for given Id**********/
	
	@Override
	public String deleteCoursesById(int id) {
		dao.deleteById(id);
		return "Courses are deleted for this id";
	}

}
