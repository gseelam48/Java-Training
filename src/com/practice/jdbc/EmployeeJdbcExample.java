package com.practice.jdbc;

import java.sql.*;


public class EmployeeJdbcExample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdatabase", "root", "Srinu@115");
        EmployeeJdbcExample example = new EmployeeJdbcExample();
        example.createTable(connection);
        example.insertEmployees(connection);
        example.retrieveEmployees(connection);
        example.updateEmployeeSalary(connection, 5, 40000);
        example.deleteEmployee(connection, 4);


    }

    public void createTable(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS employees (" + "id INT PRIMARY KEY AUTO_INCREMENT, " + "name VARCHAR(100), " + "salary DOUBLE, " + "department VARCHAR(100))");
        System.out.println("table created successfully");
    }

    // Method 3: Insert employees
    public void insertEmployees(Connection connection) throws SQLException {

        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO employees (name, salary, department) VALUES (?, ?, ?)");

        preparedStatement.setString(1, "John");
        preparedStatement.setDouble(2, 50000);
        preparedStatement.setString(3, "IT");
        preparedStatement.executeUpdate();

        preparedStatement.setString(1, "Alice");
        preparedStatement.setDouble(2, 60000);
        preparedStatement.setString(3, "HR");
        preparedStatement.executeUpdate();

        preparedStatement.setString(1, "Bob");
        preparedStatement.setDouble(2, 70000);
        preparedStatement.setString(3, "Finance");
        preparedStatement.executeUpdate();

        preparedStatement.setString(1, "Charlie");
        preparedStatement.setDouble(2, 55000);
        preparedStatement.setString(3, "Sales");
        preparedStatement.executeUpdate();

        preparedStatement.setString(1, "Diana");
        preparedStatement.setDouble(2, 65000);
        preparedStatement.setString(3, "Marketing");
        preparedStatement.executeUpdate();

        System.out.println("✅ Employees inserted successfully.");

    }

    // Method 4: Retrieve employees
    public void retrieveEmployees(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from employees");
        System.out.println("📋 Employee Details:");
        while (resultSet.next()) {
            System.out.println("ID: " + resultSet.getInt("id") +
                    ", Name: " + resultSet.getString("name") +
                    ", Salary: " + resultSet.getDouble("salary") +
                    ", com.hibernate.entity.Department: " + resultSet.getString("department"));
        }
    }

    // Method 5: Update employee salary
    public void updateEmployeeSalary(Connection connection, int id, double newSalary) throws SQLException {

        PreparedStatement preparedStatement = connection.prepareStatement("UPDATE employees SET salary = ? WHERE id = ?");
        preparedStatement.setDouble(1, newSalary);
        preparedStatement.setInt(2, id);
        int rows = preparedStatement.executeUpdate();
        System.out.println("✅ Salary updated for " + rows + " employee(s).");

    }

    // Method 6: Delete employee
    public void deleteEmployee(Connection connection, int id) throws SQLException {
        PreparedStatement prepareStatement = connection.prepareStatement("DELETE FROM employees WHERE id = ?");
        prepareStatement.setInt(1, id);
        int rows = prepareStatement.executeUpdate();
        System.out.println("✅ Deleted " + rows + " employee(s).");

    }
}

