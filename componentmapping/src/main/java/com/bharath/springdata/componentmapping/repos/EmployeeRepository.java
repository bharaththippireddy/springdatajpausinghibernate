package com.bharath.springdata.componentmapping.repos;

import org.springframework.data.repository.CrudRepository;

import com.bharath.springdata.componentmapping.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
