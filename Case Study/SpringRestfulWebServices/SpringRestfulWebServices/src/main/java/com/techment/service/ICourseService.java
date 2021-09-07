package com.techment.service;

import java.util.List;

import com.techment.entity.Courses;

public interface ICourseService {

	public List<Courses> listAllCourses();
	public String saveCourses(Courses course);
	public Courses getCoursesById(int id);
	public String deleteCoursesById(int id);

}
