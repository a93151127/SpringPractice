package com.luv2code.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApp {

	public static void main(String[] args) {
		//read the config file
		ClassPathXmlApplicationContext context=new
		ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring container
		Coach theCoach=context.getBean("myCoach",Coach.class);
		//call the method
		System.out.println(theCoach);
		//close context
		context.close();
	}

}
