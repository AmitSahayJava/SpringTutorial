package com.sahay.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sahay.beans.FlipCart;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
		FlipCart cart=context.getBean("filpcart", FlipCart.class);
		cart.orderItem();
		context.close();

	}

}
