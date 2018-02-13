package com.sahay.beans;

public class DTDC implements Courier {

	@Override
	public String transportItem(String object) {
		// TODO Auto-generated method stub
		return  "Greeting from DTDC---Your Ordered Item "+object+" will be delivered by DTDC";
	}

}
