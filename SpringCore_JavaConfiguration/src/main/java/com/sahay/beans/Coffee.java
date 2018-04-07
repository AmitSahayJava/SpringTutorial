package com.sahay.beans;

import org.springframework.stereotype.Component;

@Component
public class Coffee implements HotDrink {
	public void serve() {
		System.out.println("Coffee Will be Delevered Soon");
	}
}
