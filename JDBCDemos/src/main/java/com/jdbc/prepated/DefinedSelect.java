package com.jdbc.prepated;

import java.sql.*;

public class DefinedSelect {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String userName = "root";
        String password = "root";
        String query = "Select * from cab where cabNumber = ?";
        try (
                Connection connection = DriverManager.getConnection(url, userName, password);
                PreparedStatement statement = connection.prepareStatement(query);
        ) {
            statement.setInt(1, 8521);
            try (ResultSet result = statement.executeQuery()) {
                while (result.next()) {
                    int cabNumber = result.getInt("cabNumber");
                    String dropLocation = result.getString("dropLocation");
                    String pickupLocation = result.getString("pickupLocation");
                    String pickupTime = result.getString("pickupTime");
                    String pickupDate = result.getString("pickupDate");
                    String driverName = result.getString("driverName");
                    System.out.println("Cab Number: " + cabNumber + ", Drop Up Location: " + dropLocation
                            + ", Pick Up Location: " + pickupLocation + ", Pick Up Time: " + pickupTime
                            + ", Pick Up Date: " + pickupDate + ", Driver Name: " + driverName);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Rows printed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
