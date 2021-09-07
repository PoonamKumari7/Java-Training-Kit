package com.techment.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techment.entity.Courses;

public interface ICourseDao extends JpaRepository<Courses, Integer>{


}
