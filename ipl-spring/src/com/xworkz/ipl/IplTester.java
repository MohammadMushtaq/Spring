package com.xworkz.ipl;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.ipl.entity.IplEntity;
import com.xworkz.ipl.service.IplService;

public class IplTester {

	public static void main(String[] args) {
		
		IplEntity iplEntity= new IplEntity("kolkata kr","srkhann","goutam gambir","vivoipl",LocalDate.of(2002, 5, 15),1500000d);
		
	
		ApplicationContext container= new ClassPathXmlApplicationContext("spring1.xml");
		
		IplService service= container.getBean(IplService.class);
		
		service.saveAndValidate(iplEntity);
		}
		
}
