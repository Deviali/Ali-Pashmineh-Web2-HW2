package com.dao;

import java.util.List;

import com.model.CourseBean;
import com.model.StudentBean;

public interface StudentDao {
	
	public int addStudent(StudentBean studentBean);
	public List<CourseBean> getAllCourses();
	public int assignCourse(int studentId,String coursName);

}
