package com.sahay.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("234")         /*we should avoid @Value uses because for any change we need to */
	private int id;               /*Modify .java file , it is like hard coding only*/
	@Value("Amit Kumar")
	private String name;
	@Autowired
	private PanCard panCard;
	public int getId() {
		return id;
	}                             /*If we read @Value from properties file then it is good*/
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
