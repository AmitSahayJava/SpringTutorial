package com.sahay.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Employee {
	
	private int id;
	private String name;
	@Autowired(required=false)
	private PanCard pancard;
	
	public Employee() {
		System.out.println("Employee Object is Created");
	}

	public int getId() {
		return id;
	}
	@Required  
	public void setId(int id) { /*Employee id is mandatory*/
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PanCard getPancard() {
		return pancard;
	}

	public void setPancard(PanCard pancard) {
		this.pancard = pancard;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", pancard=" + pancard + "]";
	}
	

}
