package com.xworkz.customer.service;

import com.xworkz.customer.entity.CustomerEntity;
import com.xworkz.customer.repository.CustomerRepository;


public class CustomerServiceImpl implements CustomerService{

	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository= customerRepository;
	}
	
	@Override
	public boolean saveAndValidate(CustomerEntity customerEntity) {
		boolean valid= false;
		if(customerEntity.getCName()!=null && customerEntity.getCName().length()>5 && customerEntity.getCName().length()<15) {
			valid=true;
			System.out.println(customerEntity.getCName());
			
		}
		else {
			System.out.println("its not valid name");
			return false;
		}
		if(customerEntity.getAge()!=0 && customerEntity.getAge()>15) {
			valid= true;
		}else {
			System.out.println("its not valid age");
			return false;
		}
		if(customerEntity.getCLocation()!=null) {
			valid= true;
		}else {
			System.out.println("its not valid age");
			return false;
		}
		if(customerEntity.getMobile()!=0 && String.valueOf(customerEntity.getMobile()).length()==10){
			valid=true;
			
		}else {
			System.out.println("its not 10 digit");
			return false;
		}
		
		if(valid=true) {
			
			this.customerRepository.save(customerEntity);
		}
		else {
			return false;
		}
		
		
		
		
		return false;
	}

	
}
