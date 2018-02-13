package com.sahay.beans;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

public class FlipCart {
	@Autowired
	private Courier courier;//Autowired first check by name if any bean id with courier is 
	    //available. it will use it. else it will check by type 
	public void orderItem(){
		System.out.println("Type any item name");
		Scanner scanner=new Scanner(System.in);
		String item=scanner.next();
		scanner.close();
		//---Now to transport this item to the customer it uses courier service-----
		 String message=courier.transportItem(item);
		 System.out.println(message);
	}

}
