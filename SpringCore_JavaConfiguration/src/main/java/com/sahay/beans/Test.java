package com.sahay.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(RestorentConfig.class);
		Restorent restorent=context.getBean(Restorent.class);
		restorent.order();
		//-----------------------------------------
        restorent.printDeveloperInfo();
	}

}
