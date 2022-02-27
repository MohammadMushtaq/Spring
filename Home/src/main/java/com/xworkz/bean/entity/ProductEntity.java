package com.xworkz.bean.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xworkz.bean.constants.ProductType;
import com.xworkz.bean.constants.QuantityType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table (name="product_detail")
public class ProductEntity {
@Id
@Column (name="p_name")
	private String name;
@Column (name="p_type")
	private String productType;
@Column (name="p_quantity")
	private String quantityType;
@Column (name="p_price")
	private double price;
	
	public ProductEntity(String name, String productType, String quantityType, double price) {
		super();
		this.name = name;
		this.productType = productType;
		this.quantityType = quantityType;
		this.price = price;
	}
	
}
