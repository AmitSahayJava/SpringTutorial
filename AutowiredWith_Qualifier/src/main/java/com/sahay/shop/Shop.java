package com.sahay.shop;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.sahay.items.Item;

public class Shop {
	@Autowired
	@Qualifier("apple")//If we remove this. then error because There are two beans of same type
	private Item item;
	
	public void orderItem(){
		
		System.out.println(item.toString());
	}

}
