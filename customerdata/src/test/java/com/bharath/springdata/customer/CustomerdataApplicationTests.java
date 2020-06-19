package com.bharath.springdata.customer;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.bharath.springdata.customer.entities.Address;
import com.bharath.springdata.customer.entities.Customer;
import com.bharath.springdata.customer.repository.CustomerRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerdataApplicationTests {

	@Autowired
	private CustomerRepository customerRepository;

	@Test
	public void testCreateCustomer() {
		Customer customer = new Customer();
		customer.setName("John");
		customer.setEmail("john@gmail.com");
		customerRepository.save(customer);
	}

	@Test
	public void testReadCustomer() {
		Customer customer = customerRepository.findOne(1);
		System.out.println(customer);
	}

	@Test
	public void testUpdateCustomer() {
		Customer customer = customerRepository.findOne(1);
		customer.setName("John Reddy");
		customerRepository.save(customer);
	}

	@Test
	public void testDeleteCustomer() {
		customerRepository.delete(1);
	}
	
	@Test
	public void testCreateCustomerWithAddress() {
		Customer customer = new Customer();
		customer.setName("John");
		customer.setEmail("john@gmail.com");
		
		Address address = new Address();
		address.setCity("Austin");
		address.setState("Texas");
		address.setStreetAddress("Spice Wood Springs");
		address.setCountry("USA");
		address.setZipcode("78755");
		customer.setAddress(address);
		
		customerRepository.save(customer);
		
	}
	
	@Test
	public void testFindByNameAndEmail() {
		System.out.println(customerRepository.findByNameAndEmail("John","john@gmail.com"));
	}
	
	@Test
	public void testFindByEmailLike() {
		System.out.println(customerRepository.findByEmailLike("%john@g%"));
	}
	
	@Test
	public void testFindByIdIn() {
		System.out.println(customerRepository.findByIdIn(Arrays.asList(2)));
	}
	
	@Test
	@Transactional
	@Rollback(false)
	public void testUpdateEmail() {
		customerRepository.updateEmail(2, "john@bharathmail.com");
	}

}
