package com.sahay.item;

public class Ball implements Items {
	private int price;
	private String brand;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Ball [price=" + price + ", brand=" + brand + "]";
	}


}
