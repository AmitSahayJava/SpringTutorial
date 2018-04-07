package com.sahay.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    private int rollNumber;
    private String name;
    private Address address;
    

	public Student(Address address) {
		super();
		this.address = address;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
    public void getStudent(){
    	System.out.println("Roll Code: "+rollNumber+"\nName: "+name+"\nAddress: "+address);
    }
}
