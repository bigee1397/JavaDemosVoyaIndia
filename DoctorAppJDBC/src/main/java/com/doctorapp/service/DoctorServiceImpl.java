package com.doctorapp.service;

import com.doctorapp.exception.DoctorNotFoundException;
import com.doctorapp.exception.IdNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.repository.DoctorRepositoryImpl;
import com.doctorapp.repository.IDoctorRepository;

import java.util.List;

public class DoctorServiceImpl implements IDoctorService {
    private final IDoctorRepository doctorRepository = new DoctorRepositoryImpl();
    @Override
    public void addDoctor(Doctor doctor) {
        doctorRepository.addDoctor(doctor);
    }

    @Override
    public void updateDoctor(int doctorId, double consultationFee) {
        doctorRepository.updateDoctor(doctorId, consultationFee);
    }

    @Override
    public void deleteDoctor(int doctorId) {
        doctorRepository.deleteDoctor(doctorId);
    }

    @Override
    public List<Doctor> getAll() {
        return doctorRepository.findAll();
    }

    @Override
    public Doctor getById(int doctorId) throws IdNotFoundException {
        if(doctorRepository.findById(doctorId) == null) throw new IdNotFoundException("Doctor with respective ID " + doctorId + " not found.");
        return doctorRepository.findById(doctorId);
    }

    @Override
    public List<Doctor> getBySpeciality(String speciality) throws DoctorNotFoundException {
        if (doctorRepository.findBySpeciality(speciality).isEmpty()) throw new DoctorNotFoundException("Doctor with the specialised in " + speciality + " not found.");
        return doctorRepository.findBySpeciality(speciality);
    }

    @Override
    public List<Doctor> getBySpecialityAndExperience(String speciality, int experience) throws DoctorNotFoundException {
        if (doctorRepository.findBySpecialityAndExperience(speciality,experience).isEmpty()) throw new DoctorNotFoundException("Doctor with speciality and exp not found.");
        return doctorRepository.findBySpecialityAndExperience(speciality,experience);
    }

    @Override
    public List<Doctor> getBySpecialityAndFeesLessThan(String speciality, int consultationFees) throws DoctorNotFoundException {
        if(doctorRepository.findBySpecialityAndFeesLessThan(speciality, consultationFees).isEmpty()) throw new DoctorNotFoundException("Doctor with speciality and fee less than " + consultationFees + " is not found.");
        return doctorRepository.findBySpecialityAndFeesLessThan(speciality, consultationFees);
    }

    @Override
    public List<Doctor> getBySpecialityAndRating(String speciality, int ratings) throws DoctorNotFoundException {
        if(doctorRepository.findBySpecialityAndRating(speciality, ratings).isEmpty()) throw new DoctorNotFoundException("Doctor not found with speciality and ratings.");
        return doctorRepository.findBySpecialityAndRating(speciality,ratings);
    }

    @Override
    public List<Doctor> getBySpecialityAndNameContains(String speciality, String doctorName) throws DoctorNotFoundException {
        if (doctorRepository.findBySpecialityAndNameContains(speciality,doctorName).isEmpty()) throw new DoctorNotFoundException("Doctor with speciality and name containing " + doctorName + " not found.");
        return doctorRepository.findBySpecialityAndNameContains(speciality,doctorName);
    }
}
