package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		
		ApplicationContext apx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//GymManager gm= apx.getBean("map",GymManager.class);
		//gm.displaydetails();
		
	ClassPathXmlApplicationContext a=	(ClassPathXmlApplicationContext)apx;
  a.close();
	}

}
