package com.xworkz.bean.service;

import com.xworkz.bean.entity.ProductEntity;

public interface ProductService {

	boolean validateAndSave(ProductEntity productEntity);
	
}
