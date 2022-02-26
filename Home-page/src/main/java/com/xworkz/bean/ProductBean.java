package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.bean.constants.QuantityType;
import com.xworkz.bean.entity.ProductEntity;
import com.xworkz.bean.service.ProductService;

@Component
@RequestMapping("/")
public class ProductBean {
	
	@Autowired
	private ProductService productService;
	
	public ProductBean() {
		System.out.println("invoked bean");
	}
	
	@RequestMapping("pro.do")
	public String governmentDetail(@RequestParam String name,@RequestParam("ProductType") String ProductType
			,@RequestParam("quantityType") String quantityType, @RequestParam double price) {
		
		System.out.println(name);
		System.out.println(ProductType);
		System.out.println(quantityType);
		System.out.println(price);
		
		ProductEntity productEntity1=new ProductEntity(name, ProductType, quantityType, price);
		this.productService.validateAndSave(productEntity1);
			
		return "/home.html";
		
		
	}
}
