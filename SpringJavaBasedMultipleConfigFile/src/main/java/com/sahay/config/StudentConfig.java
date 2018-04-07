package com.sahay.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sahay.beans.Address;
import com.sahay.beans.Student;

@Configuration
public class StudentConfig {
	@Bean
	public Student student() {
		Student s = new Student(address());
		s.setRollNumber(1);
		s.setName("Bauaa Sumit");
		return s;
	}

	@Bean
	public Address address() {
		Address addr = new Address();
		addr.setStreet("Hanuman Nagar");
		addr.setCity("Patna");
		addr.setState("Bihar");
		addr.setCountry("India");
		addr.setZipCode(800026);
		return addr;
	}
}
