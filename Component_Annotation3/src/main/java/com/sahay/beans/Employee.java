package com.sahay.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("${emp.id}")         
	private int id;               
	@Value("${emp.name}")
	private String name;
	@Autowired
	private PanCard panCard;
	public int getId() {
		return id;
	}                             
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PanCard getPanCard() {
		return panCard;
	}
	public void setPanCard(PanCard panCard) {
		this.panCard = panCard;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", panCard=" + panCard + "]";
	}
	

}
