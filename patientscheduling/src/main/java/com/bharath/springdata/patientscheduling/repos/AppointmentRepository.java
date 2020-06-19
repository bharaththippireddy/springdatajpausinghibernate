package com.bharath.springdata.patientscheduling.repos;

import org.springframework.data.repository.CrudRepository;

import com.bharath.springdata.patientscheduling.entities.Appointment;

public interface AppointmentRepository extends CrudRepository<Appointment, Long> {

}
