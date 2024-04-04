package com.excelr.basics.jdbc.miniproject.oracle;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.excelr.basics.jdbc.miniproject.oracle.Student;

public class JDBCDemoOracle {
    public static void main(String[] args) {
        // Database connection parameters
        String dbDriver = "oracle.jdbc.OracleDriver";
        String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
        String dbUsername = "system";
        String dbPassword = "tiger";

        try {
            // Load the Oracle JDBC driver
            Class.forName(dbDriver);

            try (
                // Establish the connection, create statement, and execute query
                Connection connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM student")
            ) {
                // Process the result set and populate Student objects
                List<Student> students = new ArrayList<>();
                while (resultSet.next()) {
                    Student student = new Student();
                    student.setReg(resultSet.getInt("reg"));
                    student.setName(resultSet.getString("name"));
                    student.setBranch(resultSet.getString("branch"));
                    student.setEmail(resultSet.getString("email"));
                    student.setContact(resultSet.getString("contact"));

                    students.add(student);
                }

                // Print the student details
                for (Student student : students) {
                    System.out.println("Registration Number: " + student.getReg());
                    System.out.println("Name: " + student.getName());
                    System.out.println("Branch: " + student.getBranch());
                    System.out.println("Email: " + student.getEmail());
                    System.out.println("Contact: " + student.getContact());
                    System.out.println("--------------------------------------");
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
