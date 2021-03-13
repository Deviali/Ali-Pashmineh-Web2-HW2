package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDao;
import com.daoImpl.StudentDaoImpl;
import com.daoImpl.UserDaoImpl;
import com.model.CourseBean;
import com.model.StudentBean;


/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/student")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      StudentDao studentDao=new StudentDaoImpl();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getServletPath();
		System.out.println("actioNNN gg "+action);
		String action2 = request.getParameter("save");
		System.out.println("url "+action2);
		if(request.getParameter("save")!=null){
			System.out.println("insert called");
			String fName = request.getParameter("fname");
	        String lName = request.getParameter("lname");
	        String city = request.getParameter("city");
	        String age = request.getParameter("age");
	        String country = request.getParameter("country");
	        String gender = request.getParameter("gender");
	        StudentBean studentBean =new StudentBean(fName, lName, city, Integer.parseInt(age), country, gender);
	        int count=studentDao.addStudent(studentBean);
	        if(count>0){
	        	List < CourseBean > listCourse = studentDao.getAllCourses();
		        request.setAttribute("listCourse", listCourse);
		        RequestDispatcher dispatcher = request.getRequestDispatcher("list_course.jsp");
		        dispatcher.include(request, response);
	        	//response.sendRedirect("list_course.jsp");
	        }else{
	        	response.sendRedirect("student.jsp");
	        }
	        
	    }
		if(request.getParameter("assign")!=null){
			System.out.println("update called");
			String courseName = request.getParameter("courseName");
			studentDao.assignCourse(UserDaoImpl.studentId,courseName);
			response.sendRedirect("student.jsp");
		}
		if(request.getParameter("list")!=null){
			System.out.println("listttttttttttttttt");
			List < CourseBean > listCourse = studentDao.getAllCourses();
	        request.setAttribute("listCourse", listCourse);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("list_course.jsp");
	        dispatcher.include(request, response);
			
		}
		if(request.getParameter("student")!=null){
			RequestDispatcher dispatcher = request.getRequestDispatcher("student.jsp");
	        dispatcher.include(request, response);
			
		}
		
		
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
