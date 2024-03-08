package com.jdbc.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertIntoTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String userName = "root";
        String password = "root";
        try(
                Connection connection = DriverManager.getConnection(url,userName,password);
                Statement statement = connection.createStatement();
            ) {
                String query = "insert into employee values ('Guru',4,'Belgaum');";
                boolean result = statement.execute(query);
                System.out.println("Data inserted " + !result);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
