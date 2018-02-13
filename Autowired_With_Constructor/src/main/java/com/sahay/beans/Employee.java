package com.sahay.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Employee {
	
	private int id;
	private String name;	
	private PanCard pancard;	

	@Autowired
	public Employee(int id, String name, PanCard pancard) {
		super();
		this.id = id;
		this.name = name;
		this.pancard = pancard;
		System.out.println("Employee Object is Created");
	}




	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", pancard=" + pancard + "]";
	}
	

}
