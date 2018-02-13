package com.sahay.items;

public class Ball implements Item {
	private int price;
	private String sports;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getSports() {
		return sports;
	}
	public void setSports(String sports) {
		this.sports = sports;
	}
	@Override
	public String toString() {
		return "Ball [price=" + price + ", sports=" + sports + "]";
	}
	
}
