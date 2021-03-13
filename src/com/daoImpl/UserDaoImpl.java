package com.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dao.UserDao;
import com.model.UserBean;
import com.util.Dbconnection;

public class UserDaoImpl implements UserDao {
	
	private Connection conn;
	public static int studentId;

	@Override
	public void userRegister(UserBean userBean) {
		         
         try
         {
        	 conn=Dbconnection.getConnection();
    		 PreparedStatement preparedStatement = null;
             String query = "insert into user(email,password) values (?,?)";
             preparedStatement = conn.prepareStatement(query); 
             preparedStatement.setString(1, userBean.getEmail());
             preparedStatement.setString(2, userBean.getPassword());
             
             preparedStatement.executeUpdate();
         }
         catch(SQLException e)
         {
            e.printStackTrace();
         }       
     }

	@Override
	public boolean login(UserBean userBean) {
		boolean status = false;
		try
        {
       	 conn=Dbconnection.getConnection();
   		 PreparedStatement preparedStatement = null;
            String query = "select * from user where email = ? and password = ? ";
            preparedStatement = conn.prepareStatement(query); 
            preparedStatement.setString(1, userBean.getEmail());
            preparedStatement.setString(2, userBean.getPassword());
            
            ResultSet rs= preparedStatement.executeQuery();
            status=rs.next();
            studentId=rs.getInt("id");
            System.out.println("student id " + studentId);
        }
        catch(SQLException e)
        {
           e.printStackTrace();
        }
		return status;
	}
	

}
