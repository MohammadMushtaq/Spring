package com.xworkz.customer.service;

import com.xworkz.customer.entity.CustomerEntity;

public interface CustomerService {

	boolean saveAndValidate(CustomerEntity customerEntity);
}
