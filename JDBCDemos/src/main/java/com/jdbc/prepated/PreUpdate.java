package com.jdbc.prepated;

import java.sql.*;
import java.util.Scanner;

public class PreUpdate {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String userName = "root";
        String password = "root";
        String query = "update cab set driverName = ? where cabNumber = ?;";
        try (
                Connection connection = DriverManager.getConnection(url, userName, password);
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                Scanner sc = new Scanner(System.in);
        ) {
            System.out.println("Enter cab number");
            int cabNumber = sc.nextInt();
            System.out.println("Enter driver name");
            String driverName = sc.next();
            preparedStatement.setString(1, driverName);
            preparedStatement.setInt(2, cabNumber);

            boolean res = preparedStatement.execute();
            System.out.println(!res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
