package com.practice.jdbc;

import java.sql.*;

public class JdbcAss1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdatabase", "root", "Srinu@115");
        JdbcAss1 jdbcAss1 = new JdbcAss1();
        jdbcAss1.createTable(connection);
    }

    public void createTable(Connection connection) throws ClassNotFoundException, SQLException {
        Statement statement = connection.createStatement();
        statement.executeUpdate("create table employee1(id int,name varchar(30))");
        System.out.println("table created successfully");
    }

}
