package com.sahay.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Restorent {
	@Autowired
	@Qualifier("coffee")
   private HotDrink hotDrink;
   public void order(){
	   hotDrink.serve();
   }
   @Autowired
   private AppDeveloperInfo appDeveloperInfo;   
   public void printDeveloperInfo(){
	   System.out.println("This API Has Been Developed By: "+appDeveloperInfo.getName());	
   }
}
