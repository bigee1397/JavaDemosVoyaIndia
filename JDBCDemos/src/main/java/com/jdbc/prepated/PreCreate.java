package com.jdbc.prepated;

import java.sql.*;

public class PreCreate {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String userName = "root";
        String password = "root";
        String query = "create table cab(cabNumber int primary key, dropLocation varchar(40), pickupLocation varchar(30), pickupTime time, pickupDate date, driverName varchar(30));";
        try(
            Connection connection = DriverManager.getConnection(url,userName,password);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ) {
            boolean res = preparedStatement.execute();
            System.out.println(!res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
