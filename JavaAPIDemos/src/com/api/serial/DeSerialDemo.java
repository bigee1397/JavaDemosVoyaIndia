package com.api.serial;

import java.io.*;

public class DeSerialDemo {
    public static void main(String[] args) {
            Student student = null;
        try(
        FileInputStream fileInputStream = new FileInputStream("stud.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ) {
            student = (Student) objectInputStream.readObject();
            System.out.println("Completed: " + student);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
