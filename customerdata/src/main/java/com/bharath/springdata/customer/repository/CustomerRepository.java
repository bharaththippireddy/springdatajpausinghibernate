package com.bharath.springdata.customer.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.bharath.springdata.customer.entities.Customer;
import java.lang.String;
import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

	List<Customer> findByNameAndEmail(String name, String email);

	List<Customer> findByEmailLike(String email);

	List<Customer> findByIdIn(List<Integer> ids);

	@Modifying
	@Query("update Customer cust set cust.email = :email where cust.id=:id")
	void updateEmail(@Param("id") int id, @Param("email") String email);

}
