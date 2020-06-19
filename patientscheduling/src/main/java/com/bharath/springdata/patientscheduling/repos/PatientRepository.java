package com.bharath.springdata.patientscheduling.repos;

import org.springframework.data.repository.CrudRepository;

import com.bharath.springdata.patientscheduling.entities.Patient;

public interface PatientRepository extends CrudRepository<Patient, Long> {

}
