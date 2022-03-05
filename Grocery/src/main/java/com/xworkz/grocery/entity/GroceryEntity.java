package com.xworkz.grocery.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="cosmetic.grocery")
@NamedQueries({
		@NamedQuery(name="findByName", query="select gro from GroceryEntity gro where gro.name=:nam") 	
})
public class GroceryEntity {
	@Id
	@Column(name="g_id")
	private int id;
	@Column(name="g_name")
	private String name;
	@Column(name="g_quantity")
	private int quantity;
	@Column(name="g_price")
	private double price;
	@Column(name="g_type")
	private String type;
	@Column(name="g_brand")
	private String brand;
	@Column(name="g_total")
	private double total;
	
	public GroceryEntity(String name, int quantity, double price, String type, String brand,double total) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.type = type;
		this.brand = brand;
		this.total=total;
	}
	
	
}
