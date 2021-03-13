package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnection {
	private Dbconnection(){};
	private static Connection connection;
	public static Connection getConnection(){
		if(connection==null){
			try{
				Class.forName("com.mysql.jdbc.Driver");
				connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cabinat_db","root","aliali");
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		return connection;
	
	}

}
