package com.bharath.springdata.hibernateinheritance.repos;

import org.springframework.data.repository.CrudRepository;

import com.bharath.springdata.hibernateinheritance.entities.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {

}
