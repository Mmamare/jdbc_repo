package com.day1.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//step1 load the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		String userName = "root";
		String password="Batbase657@";
		String url="jdbc:mysql://localhost:3306/Employee";
		
		Connection connection = DriverManager.getConnection(url, userName, password);
		
		//String sql = "insert into `employee`.`employee` (`employee_id`, `first_name`, `last_name`) values(?, ?, ?)";
		//String select = "select* from employee";
		
		String deleteQuery = "delete from Employee where employee_id=1";
		
		//String sql = "select*from employee.employee where ID=?";
		
		PreparedStatement ps = connection.prepareStatement(deleteQuery);
		
		int row = ps.executeUpdate();
		System.out.println(row);
		
//		ps.setInt(1, 2);
//		ps.setString(2, "Mamare");
//		ps.setString(3, "Ayino");
		
		
		
//		ResultSet  rs = ps.executeQuery();
//		while(rs.next()) {
//			System.out.println(rs.getInt(1));
//			System.out.println(rs.getString(2));
//			System.out.println(rs.getString(3));
//		}
		//System.out.println("1 row affected");

	}

}
