package com.sahay.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sahay.beans.Employee;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		Employee employee=context.getBean("employee",Employee.class);
		
		System.out.println(employee);
		context.close();
	}

}
