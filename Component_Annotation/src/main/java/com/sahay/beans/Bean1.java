package com.sahay.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
/*
 *                   @Component  (father of all...)
 * 
 *       @Controller      @Service      @Repository  
 */
@Component

public class Bean1 {
	@Autowired
   private Bean2 bean2;
	public void printInfo(){
		bean2.print();
	}
}
