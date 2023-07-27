package com.ykp.clinicals.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ykp.clinicals.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
