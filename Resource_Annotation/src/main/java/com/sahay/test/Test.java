package com.sahay.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sahay.shop.Shop;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		Shop shop=context.getBean("shop",Shop.class);
		shop.printItem();
		context.close();

	}

}
