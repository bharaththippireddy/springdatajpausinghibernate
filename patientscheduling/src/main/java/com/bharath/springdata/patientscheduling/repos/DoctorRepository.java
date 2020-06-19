package com.bharath.springdata.patientscheduling.repos;

import org.springframework.data.repository.CrudRepository;

import com.bharath.springdata.patientscheduling.entities.Doctor;

public interface DoctorRepository extends CrudRepository<Doctor, Long> {

}
