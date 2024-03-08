package com.jdbc.prepated;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;

public class PreSelect {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String userName = "root";
        String password = "root";
        String query = "Select * from cab";
        try (
                Connection connection = DriverManager.getConnection(url, userName, password);
                Statement statement = connection.createStatement();
                ResultSet result = statement.executeQuery(query);
        ) {
            while (result.next()) {
                int cabNumber = result.getInt("cabNumber");
                String dropLocation = result.getString("dropLocation");
                String pickupLocation = result.getString("pickupLocation");
                LocalTime pickupTime = LocalTime.parse(result.getTime("pickupTime").toString());
                LocalDate pickupDate = LocalDate.parse(result.getDate("pickupDate").toString());
                String driverName = result.getString("driverName");
                System.out.println("Cab Number: " + cabNumber + ", Drop Up Location: " + dropLocation
                        + ", Pick Up Location: " + pickupLocation + ", Pick Up Time: " + pickupTime
                        + ", Pick Up Date: " + pickupDate + ", Driver Name: " + driverName);
            }
            System.out.println("Rows printed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
