package com.bharath.springdata.hibernateinheritance;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bharath.springdata.hibernateinheritance.entities.Check;
import com.bharath.springdata.hibernateinheritance.entities.CreditCard;
import com.bharath.springdata.hibernateinheritance.repos.PaymentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HibernateinheritanceApplicationTests {

	@Autowired
	PaymentRepository repository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createPayment() {
		CreditCard cc = new CreditCard();
		cc.setId(123);
		cc.setAmount(1000);
		cc.setCardnumber("1234567890");
		repository.save(cc);
	}

	@Test
	public void createCheckPayment() {
		Check ch = new Check();
		ch.setId(124);
		ch.setAmount(1000);
		ch.setChecknumber("1234567890");
		repository.save(ch);
	}

}
