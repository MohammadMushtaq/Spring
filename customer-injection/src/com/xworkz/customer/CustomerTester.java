package com.xworkz.customer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.customer.entity.CustomerEntity;
import com.xworkz.customer.repository.CustomerRepository;
import com.xworkz.customer.repository.CustomerRepositoryImpl;
import com.xworkz.customer.service.CustomerService;

public class CustomerTester {

	
	public static void main(String[] args) {
		
		CustomerEntity customerEntity= new CustomerEntity("mushtaq", "bangalore", "mushtaq.xworkz@gmail.com", 9485676866l, false, 20);
		
		ApplicationContext container= new ClassPathXmlApplicationContext("spring1.xml");
		
		CustomerService repo = container.getBean(CustomerService.class);
		
		repo.saveAndValidate(customerEntity);
		
		
	}
}
