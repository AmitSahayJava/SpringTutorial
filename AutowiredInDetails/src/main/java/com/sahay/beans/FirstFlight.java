package com.sahay.beans;

public class FirstFlight implements Courier{

	@Override
	public String transportItem(String object) {
		// TODO Auto-generated method stub
		return "Your Ordered Item "+object+" will be delivered by FirstFlight";
	} 
	

}
