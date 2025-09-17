package com.practice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcPractice2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        JdbcPractice2 jdbcPractice2 = new JdbcPractice2();
        jdbcPractice2.createTable();

    }
    public void createTable() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdatabase", "root", "Srinu@115");
        PreparedStatement statement = connection.prepareStatement("insert into employee values(?,?,?)");
        statement.setInt(1, 23);
        statement.setString(2, "gopi");
        statement.setString(3, "reddy");
        statement.executeUpdate();
        statement.setInt(1, 24);
        statement.setString(2, "kiran");
        statement.setString(3, "reddy");
        statement.executeUpdate();
    }
}
