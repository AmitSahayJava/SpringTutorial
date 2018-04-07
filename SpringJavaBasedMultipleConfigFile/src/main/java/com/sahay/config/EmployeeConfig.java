package com.sahay.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.sahay.beans.Employee;

@Configuration
@Import(value=StudentConfig.class)
public class EmployeeConfig {
	@Bean
	public Employee employee(){
		Employee e=new Employee();
		e.setId(101);
		e.setName("Sumit Kumar");
		return e;
	}

}
