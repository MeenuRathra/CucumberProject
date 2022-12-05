package BasePage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class getdataFROMdatabase {


	 Connection connection;
	 Statement statement;
	 ResultSet resultSet;
	 String columnValue;
	 
	 public String getDataFromDb(String columnName)  {
	  
	//  set properties for mySQL 
	  try {   
	  Class.forName("com.mysql.cj.jdbc.Driver");   
	  
	  String sqlUsername= "root";
	  String sqlPassword = "password";
	  String sqlUrl = "jdbc:mysql://127.0.0.1:3306/login_details";
	  String sqlQurey = "select * from userdata;" ;
	  
	//  Create connection to the local database  
	  connection = DriverManager.getConnection(sqlUrl, sqlUsername, sqlPassword);
	  
	//  Empowering connection reference variable to execute queries   
	  statement = connection.createStatement(); 
	  
	//  Delivering query  
	  resultSet = statement.executeQuery(sqlQurey);
	   
	   while (resultSet.next()) {
	    columnValue = resultSet.getString(columnName);
	    return columnValue;
	   }
	  } catch (Exception e) {
	   e.printStackTrace();
	  } finally {  
	   
	   if(connection != null||resultSet !=null) {
	    try {
	     connection.close();
	     resultSet.close();
	     
	    } catch (SQLException e) {
	     e.printStackTrace();
	    }
	   }
	   }
		 columnValue="demo@techfios.com";
		 return columnValue;
	 }

	}
