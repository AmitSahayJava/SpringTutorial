package com.sahay.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sahay.beans.Bean1;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		Bean1 bean=context.getBean("bean1",Bean1.class);
		bean.printInfo();
		context.close();
	}

}
