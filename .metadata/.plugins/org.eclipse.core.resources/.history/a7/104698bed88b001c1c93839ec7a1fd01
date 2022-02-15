package com.xworkz.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.bean.spring.Camera;
import com.xworkz.bean.spring.Laptop;

public class SpringDirector {

	public static void main(String[] args) {
		
		ApplicationContext spring= new ClassPathXmlApplicationContext("resource/spring1.xml");
		
		Laptop laptop= spring.getBean(Laptop.class);	
	
		Camera camera= spring.getBean(Camera.class);
		
		
	
		
	}
}
