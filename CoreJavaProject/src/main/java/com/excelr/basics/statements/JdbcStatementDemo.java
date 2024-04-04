package com.excelr.basics.statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.extractor.MainExtractorFactory;

public class JdbcStatementDemo {

	public static void main(String[] args) {
		String dbDriver = "oracle.jdbc.OracleDriver";
		String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbUsername = "system";
		String dbPassword = "tiger";

		try {
			Class.forName(dbDriver);

			try (Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
					Statement statement = conn.createStatement()) 
			{
				insertStudentData(statement);
				readStudentData(statement);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void insertStudentData(Statement statement) throws SQLException {
		String sql = "INSERT INTO student(reg, name, branch, email, contact)"
				+ "VALUES(104, 'tom', 'Computer Science', 'tom@example.com', '1234567890')";

		int rowsInserted = statement.executeUpdate(sql);

		if (rowsInserted > 0) {
			System.out.println("Student data successfully inserted");
		} else {
			System.out.println("Failed to insert student data!");
		}
	}

	public static void readStudentData(Statement statement) throws SQLException {
		String sql = "SELECT * FROM student";

		try (ResultSet resultSet = statement.executeQuery(sql)) {
			System.out.println("Student Data");
			while (resultSet.next()) {
				int reg = resultSet.getInt("reg");
				String name = resultSet.getString("name");
				String branch = resultSet.getString("branch");
				String email = resultSet.getString("email");
				String contact = resultSet.getString("contact");

				System.out.println("Registration number: " + reg);
				System.out.println("Name: " + name);
				System.out.println("Branch: " + branch);
				System.out.println("Email: " + email);
				System.out.println("Contact: " + contact);
				System.out.println("-------------------");

			}
		}

	}
}
