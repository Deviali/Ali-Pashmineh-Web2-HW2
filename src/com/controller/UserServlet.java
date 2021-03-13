package com.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.StyledEditorKit.BoldAction;

import com.dao.UserDao;
import com.daoImpl.UserDaoImpl;
import com.model.UserBean;
import com.util.PasswordEncryptDecrypt;


/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	UserDao rlDao=new UserDaoImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
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
		if(action.equals("/reg")){
			System.out.println("insert called");
			String email = request.getParameter("email");
	        String password = request.getParameter("password");
	        String encryptPass=PasswordEncryptDecrypt.encrypt(password,"key");
	        UserBean registrationLogin=new UserBean(email, encryptPass);
	        rlDao.userRegister(registrationLogin);
	        response.sendRedirect("login.jsp");
	        
		}
		if(action.equals("/registration")){
		
			//RequestDispatcher dispatcher = request.getRequestDispatcher("createLibraryUser.jsp");
			//dispatcher.forward(request, response);
			response.sendRedirect("registration.jsp");
				    
		}
		if(action.equals("/")){
			
			//RequestDispatcher dispatcher = request.getRequestDispatcher("createLibraryUser.jsp");
			//dispatcher.forward(request, response);
			response.sendRedirect("login.jsp");
				    
		}
		if(action.equals("/login")){
			System.out.println("insert called");
			String email = request.getParameter("email");
	        String password = request.getParameter("password");
	        String encryptPass=PasswordEncryptDecrypt.encrypt(password,"key");
	        UserBean userBean=new UserBean(email, encryptPass);
	        boolean status= rlDao.login(userBean);
	        if(status){
	        	System.out.println("login successfully");
	        	response.sendRedirect("student.jsp");
	        }
	        else{
	        	System.out.println("Invalid Credentials");
	        	response.sendRedirect("login.jsp");
	        }
	        
	        
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
