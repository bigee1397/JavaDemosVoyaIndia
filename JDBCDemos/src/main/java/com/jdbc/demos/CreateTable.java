package com.jdbc.demos;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String userName = "root";
        String password = "root";
        try(Connection connection = DriverManager.getConnection(url,userName,password);
            Statement statement = connection.createStatement();) {
            String query = "create table employee (name varchar(20),employeeId int primary key, city varchar(30));";
            boolean result = statement.execute(query);
            System.out.println("Table created " + !result);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
