package com.techment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.entity.Courses;
import com.techment.service.ICourseService;

@RestController
@RequestMapping(value = "/courseController")
public class CourseController {
	
	@Autowired
	ICourseService iCourseService;
	
	//For viewing all courses
	@GetMapping(value = "/viewAllCourses")
	public List<Courses> viewCourseList()
	{
		return iCourseService.listAllCourses();
	}
	
	//For Listing the courses by given ID
	@GetMapping(value = "viewCoursesById/{id}")
	public Courses getCourseById(@PathVariable int id)
	{
		return iCourseService.getCoursesById(id);
		
	}
	
	//For adding new course
	@PostMapping(value = "/addingNewCourse")
	public String addNewCourse(@RequestBody Courses courses) {
		iCourseService.saveCourses(courses);
		return "Course added Successfully.";
	}
	
	//For deleting the course
	@DeleteMapping(value = "/deleteCourseById/{id}")
	public String deleteCourseById(@PathVariable int id) {
		iCourseService.deleteCoursesById(id);
		return "Course deleted Succesfully.";
	}
	
	//For updating course
	@PutMapping(value = "/updateCoursesById/{id}")
	public String updateCourseById(@PathVariable int id, @RequestBody Courses courses) {
		
		Courses co = iCourseService.getCoursesById(id);
		co.setName(courses.getName());
		co.setPrice(courses.getPrice());			
		iCourseService.saveCourses(co);
		return "Course Updated Succesfully.";
	}

}
