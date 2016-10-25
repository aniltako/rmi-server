package com.fuse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class ServerApplication {
	
	public static void main(String args[]){
		
//		SpringApplication.run(ServerApplication.class, args);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  
		System.out.println("Waiting for requests"); 
	}

}
