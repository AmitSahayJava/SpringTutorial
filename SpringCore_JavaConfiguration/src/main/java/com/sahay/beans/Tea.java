package com.sahay.beans;

import org.springframework.stereotype.Component;

@Component
public class Tea implements HotDrink {
	public void serve() {
		System.out.println("Tea Will Be Server Sortly");
	}
}
