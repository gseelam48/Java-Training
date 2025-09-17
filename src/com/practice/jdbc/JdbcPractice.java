package com.practice.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcPractice {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //create connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdatabase", "root", "Srinu@115");

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from employee");
        List<Cricketers> cricketers = new ArrayList<>();
        Cricketers cricket = null;
        while (resultSet.next()) {
            cricket = new Cricketers();
            cricket.setId(resultSet.getInt(1));
            cricket.setFirstName(resultSet.getString(2));
            cricket.setLastName(resultSet.getString(3));
            cricketers.add(cricket);
            System.out.print(resultSet.getInt(1) + "  ");
            System.out.print(resultSet.getString(2) + "  ");
            System.out.print(resultSet.getString(3) + "  ");
        }
        System.out.println("using for each");
        for (Cricketers c : cricketers){
            System.out.println(c.getId()+" " + c.getFirstName()+" "+ c.getLastName());
        }
    }
}
