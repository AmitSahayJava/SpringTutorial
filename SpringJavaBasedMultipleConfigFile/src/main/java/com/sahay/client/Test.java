package com.sahay.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sahay.beans.Employee;
import com.sahay.beans.Student;
import com.sahay.config.EmployeeConfig;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Employee employee=context.getBean("employee",Employee.class);
		Student student=context.getBean("student",Student.class);
		employee.viewEmployee();
		student.getStudent();

	}

}
