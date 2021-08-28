package com.bridglabz.sqldemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException
    {
    	 Class.forName("com.mysql.cj.jdbc.Driver");    
    	 System.out.println("Driver is loaded");
    	 
    	final String url = "jdbc:mysql://localhost:3308/jdbcdemo";
 		final String userName = "root";
 		final String password = "root";
 		
 		try {
			Connection connection = DriverManager.getConnection(url, userName, password);
			System.out.println("Database is connected");
			
			Statement statement = connection.createStatement();
			String query = "select * from student;";
			
			//String insertQuery = "insert into student values('prashant',4,350);";
			//statement.executeUpdate(insertQuery);
			
			String updateQuery = "update student set total_marks=400 where roll_no=4;";
			statement.executeUpdate(updateQuery);
			
			//delete
			String deleteQuery = "delete from student where roll_no=45;";
			statement.executeUpdate(deleteQuery);
			
			
			ResultSet resultSet=statement.executeQuery(query);
			while(resultSet.next()) {
				System.out.println("name = " +resultSet.getString(1));
				System.out.println("roll_num = " +resultSet.getString(2));
				System.out.println("Total_Marks = " +resultSet.getString(3));
				System.out.println();
				
			}
 		}
 		
 			
 		
 		catch (SQLException e) {
 			System.out.println("Database is not available or not connected");
 		}
    }
}
