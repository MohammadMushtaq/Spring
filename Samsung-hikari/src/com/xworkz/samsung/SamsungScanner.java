package com.xworkz.samsung;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.samsung.entity.SamsungEntity;
import com.xworkz.samsung.repository.SamsungRepository;

public class SamsungScanner {

	public static void main(String[] args) {
		
		SamsungEntity samsungEntity= new SamsungEntity(1,"s10",20,14500d,true,"price");

		ApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
		
		SamsungRepository repo=	container.getBean(SamsungRepository.class);
	
			for (SamsungEntity string : repo.save(samsungEntity)) {
				System.out.println(string);
			} 
	}

}
