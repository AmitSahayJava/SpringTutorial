package com.sahay.shop;

import javax.annotation.Resource;

import com.sahay.item.Items;

public class Shop {
	@Resource(name="ball") //It also works as @Autowired. and with the name attribute it works
	     //as @Qualifier too
    private Items item;
    public void printItem(){
    	System.out.println(item.toString());
    }
}
