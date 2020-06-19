package com.bharath.springdata.associations.onetomany.repos;

import org.springframework.data.repository.CrudRepository;

import com.bharath.springdata.associations.onetomany.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
