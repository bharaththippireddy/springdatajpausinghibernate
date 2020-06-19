package com.bharath.springdata.idgenerators.repos;

import org.springframework.data.repository.CrudRepository;

import com.bharath.springdata.idgenerators.entities.Employee;


public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
