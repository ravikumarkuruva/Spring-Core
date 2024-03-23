package com.app.runner.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.app.runner.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
