package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	
	public static void main(String[] args) {
		ApplicationContext apx=new  ClassPathXmlApplicationContext("applicationContext.xml");
		Service ser= apx.getBean("service",Service.class);
		ser.printconnection();
	}
}
