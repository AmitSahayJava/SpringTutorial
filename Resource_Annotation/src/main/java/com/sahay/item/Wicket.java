package com.sahay.item;

public class Wicket implements Items{
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Wicket [price=" + price + "]";
	}

}
