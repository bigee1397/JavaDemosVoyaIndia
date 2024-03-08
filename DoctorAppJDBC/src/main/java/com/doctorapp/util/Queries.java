package com.doctorapp.util;

public class Queries {
    public static final String INSERTQUERY = "Insert into doctorappjdbc (doctor_name, speciality, consultation_fee, ratings, experience) values (?,?,?,?,?);";
    public static final String UPDATEQUERY = "Update doctorappjdbc set consultation_fee=? where doctor_id=?";
    public static final String DELETEQUERY = "Delete from doctorappjdbc where doctor_id=?";

    public static final String SELECTQUERY = "Select * from doctorappjdbc";

    public static final String SELECTBYSPECIALITYQUERY = "Select * from doctorappjdbc where speciality=?";
    public static final String SELECTBYSPECIALITYANDEXPQUERY = "Select * from doctorappjdbc where speciality=? and experience>?";
    public static final String SELECTBYSPECIALITYANDFEEQUERY = "Select * from doctorappjdbc where speciality=? consultation_fee<?";
    public static final String SELECTBYSPECIALITYANDRATINGSQUERY = "Select * from doctorappjdbc where speciality=? and ratings>=?";
    public static final String SELECTBYSPECIALITYANDNAME = "Select * from doctorappjdbc where speciality=? and doctor_name like '%?%'";
    public static final String SELECTBYIDQUERY = "Select * from doctorappjdbc where doctor_id=?";
}
