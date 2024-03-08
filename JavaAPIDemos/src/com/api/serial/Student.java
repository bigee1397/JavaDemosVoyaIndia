package com.api.serial;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 2L;
    private String studentName;
    private String studentId;
    private transient String department;

    public Student() {
    }

    public Student(String studentName, String studentId, String department) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.department = department;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentId='" + studentId + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}