package com.doctorapp.repository;

import com.doctorapp.model.Doctor;
import com.doctorapp.util.DoctorDB;
import com.doctorapp.util.Queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DoctorRepositoryImpl implements IDoctorRepository {
    @Override
    public void addDoctor(Doctor doctor) {
        try (Connection connection = DoctorDB.openConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(Queries.INSERTQUERY)) {
            preparedStatement.setString(1, doctor.getDoctorName());
            preparedStatement.setString(2, doctor.getSpeciality());
            preparedStatement.setDouble(3, doctor.getConsultationFee());
            preparedStatement.setInt(4, doctor.getRatings());
            preparedStatement.setInt(5, doctor.getExperience());
            preparedStatement.execute();
            System.out.println("1 Row inserted......");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateDoctor(int doctorId, double consultationFee) {
        try (Connection connection = DoctorDB.openConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(Queries.UPDATEQUERY)) {
            preparedStatement.setDouble(1, consultationFee);
            preparedStatement.setInt(2, doctorId);
            preparedStatement.execute();
            System.out.println("1 Row updated......");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteDoctor(int doctorId) {
        try (Connection connection = DoctorDB.openConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(Queries.DELETEQUERY)) {
            preparedStatement.setInt(1, doctorId);
            preparedStatement.execute();
            System.out.println("1 Row deleted......");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Doctor> findAll() {
        List<Doctor> doctorsList = new ArrayList<>();
        try (Connection connection = DoctorDB.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.SELECTQUERY)) {
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                Doctor doctor = new Doctor();
//              Adding the parameters fetched from the database to local variables and creating objects
                doctor.setDoctorId(result.getInt("doctor_id"));
                doctor.setDoctorName(result.getString("doctor_name"));
                doctor.setSpeciality(result.getString("speciality"));
                doctor.setConsultationFee(result.getDouble("consultation_fee"));
                doctor.setRatings(result.getInt("ratings"));
                doctor.setExperience(result.getInt("experience"));

//              Adding the Doctor object into the list which we return
                doctorsList.add(doctor);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctorsList;
    }

    @Override
    public List<Doctor> findBySpeciality(String speciality) {
        List<Doctor> specialityDoctors = new ArrayList<>();
        try (Connection connection = DoctorDB.openConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(Queries.SELECTBYSPECIALITYQUERY)) {
            {
                preparedStatement.setString(1, speciality);
                try (ResultSet result = preparedStatement.executeQuery()) {
                    while (result.next()) {
                        int doctorId = result.getInt("doctor_id");
                        String doctorName = result.getString("doctor_name");
                        double consultationFee = result.getDouble("consultation_fee");
                        int ratings = result.getInt("ratings");
                        int experience = result.getInt("experience");

                        specialityDoctors.add(new Doctor(doctorId, doctorName, speciality, consultationFee, ratings, experience));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return specialityDoctors;
    }

    @Override
    public List<Doctor> findBySpecialityAndExperience(String speciality, int experience) {
        List<Doctor> doctorsWithSpecialityAndExperience = new ArrayList<>();
        try (Connection connection = DoctorDB.openConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(Queries.SELECTBYSPECIALITYANDEXPQUERY)) {
            preparedStatement.setString(1, speciality);
            preparedStatement.setInt(2, experience);
            try (ResultSet result = preparedStatement.executeQuery()) {
                while (result.next()) {
                    int doctorId = result.getInt("doctor_id");
                    String doctorName = result.getString("doctor_name");
                    double consultationFee = result.getDouble("consultation_fee");
                    int ratings = result.getInt("ratings");

                    doctorsWithSpecialityAndExperience.add(new Doctor(doctorId, doctorName, speciality, consultationFee, ratings, experience));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctorsWithSpecialityAndExperience;
    }

    @Override
    public List<Doctor> findBySpecialityAndFeesLessThan(String speciality, int consultationFees) {
        List<Doctor> doctorsBySpecialityAndFees = new ArrayList<>();
        try (Connection connection = DoctorDB.openConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(Queries.SELECTBYSPECIALITYANDFEEQUERY)) {
            preparedStatement.setString(1, speciality);
            preparedStatement.setInt(2, consultationFees);
            try (ResultSet result = preparedStatement.executeQuery()) {
                while (result.next()) {
                    int doctorId = result.getInt("doctor_id");
                    String doctorName = result.getString("doctor_name");
                    double consultationFee = result.getDouble("consultation_fee");
                    int ratings = result.getInt("ratings");
                    int experience = result.getInt("experience");


                    doctorsBySpecialityAndFees.add(new Doctor(doctorId, doctorName, speciality, consultationFee, ratings, experience));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctorsBySpecialityAndFees;
    }

    @Override
    public List<Doctor> findBySpecialityAndRating(String speciality, int ratings) {
        List<Doctor> doctorsSpecialityAndRating = new ArrayList<>();
        try (Connection connection = DoctorDB.openConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(Queries.SELECTBYSPECIALITYANDRATINGSQUERY)) {
            preparedStatement.setString(1, speciality);
            preparedStatement.setInt(2, ratings);
            try (ResultSet result = preparedStatement.executeQuery()) {
                while (result.next()) {
                    int doctorId = result.getInt("doctor_id");
                    String doctorName = result.getString("doctor_name");
                    double consultationFee = result.getDouble("consultation_fee");
                    int experience = result.getInt("experience");

                    doctorsSpecialityAndRating.add(new Doctor(doctorId, doctorName, speciality, consultationFee, ratings, experience));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctorsSpecialityAndRating;
    }

    @Override
    public List<Doctor> findBySpecialityAndNameContains(String speciality, String doctorName) {
        List<Doctor> doctorsWithSpecialityAndName = new ArrayList<>();
        try (Connection connection = DoctorDB.openConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(Queries.SELECTBYSPECIALITYANDNAME)) {
            preparedStatement.setString(1, speciality);
            preparedStatement.setString(2, "%" + doctorName + "%");
            try (ResultSet result = preparedStatement.executeQuery()) {
                while (result.next()) {
                    int doctorId = result.getInt("doctor_id");
                    double consultationFee = result.getDouble("consultation_fee");
                    int ratings = result.getInt("ratings");
                    int experience = result.getInt("experience");

                    doctorsWithSpecialityAndName.add(new Doctor(doctorId, doctorName, speciality, consultationFee, ratings, experience));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctorsWithSpecialityAndName;
    }

    @Override
    public Doctor findById(int doctorId) {
        Doctor doctor = null;
        try (Connection connection = DoctorDB.openConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(Queries.SELECTBYIDQUERY)) {
            preparedStatement.setInt(1, doctorId);
            try (ResultSet result = preparedStatement.executeQuery()) {
                while (result.next()) {
                    String doctorName = result.getString("doctor_name");
                    String speciality = result.getString("speciality");
                    double consultationFee = result.getDouble("consultation_fee");
                    int ratings = result.getInt("ratings");
                    int experience = result.getInt("experience");

                    doctor = new Doctor(doctorId, doctorName, speciality, consultationFee, ratings, experience);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctor;
    }
}
