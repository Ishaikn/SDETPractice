package com.AdvanceAutomation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SelectQuery_JDBC {

	public static void main(String[] args) throws SQLException {
		// non select query

		// Step1: Register the driver

		Driver driver = new Driver();
		DriverManager.registerDriver(driver);

		// step 2: Get connection for database

		Connection Connectivity = DriverManager.getConnection("jdbc:mysql://localhost:3306/EDBApplication", "root",
				"root");

		// step 3: Create Statement

		Statement state = Connectivity.createStatement();
		String query = "select * from customer;";

		// step 4: Execute a Query

		ResultSet result = state.executeQuery(query);

		while (result.next()) {
			System.out.println(result.getString(1) + " " + result.getString(2) + " " + result.getString(3) + " ");
		}
		
		//step 5: Close the database
		Connectivity.close();
		
	}

}
