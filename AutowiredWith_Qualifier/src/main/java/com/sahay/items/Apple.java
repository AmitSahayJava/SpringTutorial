package com.sahay.items;

public class Apple implements Item {
    private int price;
    private String importedFrom;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImportedFrom() {
		return importedFrom;
	}
	public void setImportedFrom(String importedFrom) {
		this.importedFrom = importedFrom;
	}
	@Override
	public String toString() {
		return "Apple [price=" + price + ", importedFrom=" + importedFrom + "]";
	}
    
    
}
