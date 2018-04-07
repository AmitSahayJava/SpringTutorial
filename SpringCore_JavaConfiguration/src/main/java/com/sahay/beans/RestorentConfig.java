package com.sahay.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.sahay.beans"})
public class RestorentConfig {
    @Bean
	public AppDeveloperInfo appDeveloperInfo(){
    	AppDeveloperInfo appDeveloperInfo=new AppDeveloperInfo();
    	appDeveloperInfo.setName("Amit Kumar");
		return appDeveloperInfo;
	}
}
