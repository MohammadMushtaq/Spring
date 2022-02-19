
package com.xworkz.brows;

import java.awt.Container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.brows.browser.Browser;


public class Internetscanner {

	public static void main(String[] args) {
		ApplicationContext container= new ClassPathXmlApplicationContext("spring.xml");
		
		Browser browser= container.getBean(Browser.class);
		browser.surf();
		
		
	}
	
}
