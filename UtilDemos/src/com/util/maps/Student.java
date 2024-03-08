package com.util.maps;

public class Student {
    private String studentName;
    private String studentCity;

    public Student() {
    }

    public Student(String studentName, String studentCity) {
        this.studentName = studentName;
        this.studentCity = studentCity;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentCity='" + studentCity + '\'' +
                '}';
    }
}
