package com.Elsaspring.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {

	       ApplicationContext context =new ClassPathXmlApplicationContext("water.xml");
	       water w =(water)context.getBean("wa");
	       w.display();
	}

}
