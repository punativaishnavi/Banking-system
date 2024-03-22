package org.jsp.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
	public static void main(String[] args) 
	{
		String  url="jdbc:mysql://localhost:3306?user=root&password=punati";
		String query="insert into vaishnavi_db.Registration values('Mahesh','Keiuued','9056805485','kamepallimaheshsbabu@gmail.com')";
		try {
			Connection connection =DriverManager.getConnection(url);
			System.out.println("step-1");
			Statement statement=connection.createStatement();
			System.out.println("step-2");
			statement.executeUpdate(query);
			System.out.println("step-3");
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}

}
