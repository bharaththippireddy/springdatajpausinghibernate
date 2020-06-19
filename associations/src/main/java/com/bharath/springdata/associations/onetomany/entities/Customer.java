package com.bharath.springdata.associations.onetomany.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	private Set<PhoneNumber> numbers;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<PhoneNumber> getNumbers() {
		return numbers;
	}

	public void setNumbers(Set<PhoneNumber> numbers) {
		this.numbers = numbers;
	}

	public void addPhoneNumber(PhoneNumber number) {
		if (number != null) {
			if (numbers == null) {
				numbers = new HashSet<>();
			}
			number.setCustomer(this);
			numbers.add(number);
		}

	}

}
