package com.jdbc.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String userName = "root";
        String password = "root";
        try(
                Connection connection = DriverManager.getConnection(url,userName,password);
                Statement statement = connection.createStatement();
        ) {
            String query = "update employee set name = 'bhargav' where employeeId = 1;";
            int result = statement.executeUpdate(query);
            System.out.println("Row updated " + result);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
