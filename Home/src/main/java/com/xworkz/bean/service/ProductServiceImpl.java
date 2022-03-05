package com.xworkz.bean.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.bean.entity.ProductEntity;
import com.xworkz.bean.repository.ProductRepository;
@Component
public class ProductServiceImpl implements ProductService {
	
@Autowired
	private ProductRepository productRepository;
	
	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository=productRepository;
		
		System.out.println("invoked repo impl");
	}
	
	@Override
	public boolean validateAndSave(ProductEntity productEntity) {
		boolean valid =false;
		
		if(productEntity.getName()!=null  &&  productEntity.getName().length()>4) {
			valid= true;
		}
		else {
			System.err.println("in valid name");
			return valid;
		}
		if(productEntity.getProductType()!=null) {
			valid= true;
		}
		else {
			return valid;
		}
		if(productEntity.getQuantityType()!=null ) {
			valid= true;
		}
		else {
			return valid;
		}
		if(productEntity.getPrice()!=0 ) {
			valid= true;
		}
		else {
			return valid;
		}
		if (valid=true) {
			this.productRepository.save(productEntity);
		} else {
			return valid;
		}
		
		
		return false;
	}

}
