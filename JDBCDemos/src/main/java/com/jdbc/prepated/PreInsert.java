package com.jdbc.prepated;

import com.mysql.cj.jdbc.SuspendableXAConnection;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class PreInsert {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String userName = "root";
        String password = "root";
        String query = "insert into cab values (?,?,?,?,?,?);";
        try(
                Connection connection = DriverManager.getConnection(url,userName,password);
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                Scanner sc = new Scanner(System.in);
        ) {
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter cab number");
                int cabNumber = sc.nextInt();
                System.out.println("Enter drop location");
                String dropLoc = sc.next();
                System.out.println("Enter pickUp location");
                String pickUpLoc = sc.next();

                System.out.println("Enter pickUp time");
//                Time
                String time = sc.next();
                System.out.println("Enter pickUp Date");
//                  Date
                String dateData = sc.next();
                System.out.println("Enter driver name");
                String driverName = sc.next();

                preparedStatement.setInt(1,cabNumber);
                preparedStatement.setString(2, dropLoc);
                preparedStatement.setString(3, pickUpLoc);
                preparedStatement.setTime(4, Time.valueOf(time));
                preparedStatement.setDate(5, Date.valueOf(dateData));
                preparedStatement.setString(6, driverName);

                preparedStatement.execute();

            }
            boolean res = preparedStatement.execute();
            System.out.println(!res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
