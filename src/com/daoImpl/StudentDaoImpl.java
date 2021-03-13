package com.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.StudentDao;
import com.model.CourseBean;
import com.model.StudentBean;
import com.util.Dbconnection;

public class StudentDaoImpl implements StudentDao{
	private Connection conn;

	@Override
	public int addStudent(StudentBean studentBean) {
		int count=0 ;
		try
         {
			 
        	 conn=Dbconnection.getConnection();
    		 PreparedStatement preparedStatement = null;
             String query = "insert into student(first_name,last_name,city,age,country,gender) values (?,?,?,?,?,?)";
             preparedStatement = conn.prepareStatement(query); 
             preparedStatement.setString(1, studentBean.getFirstName());
             preparedStatement.setString(2, studentBean.getLastName());
             preparedStatement.setString(3, studentBean.getCity());
             preparedStatement.setInt(4, studentBean.getAge());
             preparedStatement.setString(5, studentBean.getCountry());
             preparedStatement.setString(6, studentBean.getGender());
             count=preparedStatement.executeUpdate();
         }
         catch(SQLException e)
         {
            e.printStackTrace();
         } 
		return count;
		
	}

	@Override
	public List<CourseBean> getAllCourses() {
		List<CourseBean> list=new ArrayList<>();
		try {
			conn=Dbconnection.getConnection();
			PreparedStatement preparedStatement=conn.prepareStatement("select * from course");
			ResultSet rst=preparedStatement.executeQuery();
			while(rst.next()){
				CourseBean courseBean=new CourseBean();
				courseBean.setId(rst.getInt("id"));
				courseBean.setName(rst.getString("name"));
				list.add(courseBean);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}

	@Override
	public int assignCourse(int studentId, String coursName) {
		int count=0 ;
		try
         {
        	 conn=Dbconnection.getConnection();
    		 PreparedStatement preparedStatement = null;
             String query = "insert into student_course(student_id,course_name) values (?,?)";
             preparedStatement = conn.prepareStatement(query); 
             preparedStatement.setInt(1, studentId);
             preparedStatement.setString(2, coursName);
             
             count=preparedStatement.executeUpdate();
         }
         catch(SQLException e)
         {
            e.printStackTrace();
         } 
		return count;

	}
	

}
