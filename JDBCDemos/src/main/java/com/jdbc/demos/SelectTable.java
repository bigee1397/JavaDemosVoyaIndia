package com.jdbc.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String userName = "root";
        String password = "root";
        String query = "Select * from employee";
        try(
                Connection connection = DriverManager.getConnection(url,userName,password);
                Statement statement = connection.createStatement();
                ResultSet result = statement.executeQuery(query);
        ) {
            while(result.next()) {
                String name = result.getString("name");
                int id = result.getInt("employeeId");
                String city = result.getString("city");
                System.out.println("Name: " + name + ", Employee ID: " + id + ", Employee City: " + city);
            }
            System.out.println("Rows printed");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
