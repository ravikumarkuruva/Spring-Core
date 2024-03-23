package com.app.runner.service;

import java.util.List;

import com.app.runner.entity.Patient;

public interface IPatientService {
	Integer savePatient(Patient p);
	Patient getOnePatient(Integer id);
	void updatePatient(Patient p);
	void deletePatient(Integer id);
	List<Patient> getAllPatients();
}
