package com.app.runner.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.runner.entity.Patient;
import com.app.runner.exception.PatientNotFoundException;
import com.app.runner.repo.PatientRepository;
import com.app.runner.service.IPatientService;
@Service
public class PatientServiceImpl implements IPatientService {
	@Autowired
	private PatientRepository repo;
	
	public Integer savePatient(Patient p) {
		 p=repo.save(p);
		return p.getId();
	}

	
	public Patient getOnePatient(Integer id) {
		return repo.findById(id)
				.orElseThrow(
						()->new PatientNotFoundException("PATIENT '"+id+"' NOT EXIST")
						);

	}
	
	public void updatePatient(Patient p) {
		if (p.getId()==null || !repo.existsById(p.getId())) {
			throw new PatientNotFoundException("PATIENT IS NOT FOUND BY ID '"+p.getId()+"'");
		}else
			repo.save(p);
		

	}

	
	public void deletePatient(Integer id) {
		repo.delete(getOnePatient(id));
	}
	
	public List<Patient> getAllPatients() {
		List<Patient>list=repo.findAll();
		return list;
	}

}
