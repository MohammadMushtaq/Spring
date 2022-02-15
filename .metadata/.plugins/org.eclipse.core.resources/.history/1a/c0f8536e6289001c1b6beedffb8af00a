package com.xworkz.product.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity

@Table(name = "product_detail")
@NamedQueries({ @NamedQuery(name = "getAll", query = "select product from ProductEntity product"),
		@NamedQuery(name = "getByPriceGreaterThan", query = "select product from ProductEntity product where product.price >: pri"),
		@NamedQuery(name = "getByPriceLesserThan", query = "select product.price from ProductEntity product where product.price >: pri"),
		@NamedQuery(name = "getByNameAndId", query = "select product from ProductEntity product where product.name=:nam and product.id=:id"),
		@NamedQuery(name = "getTotal", query = "select count(product) from ProductEntity product"),
		@NamedQuery(name = "getMaxPrice", query = "select product from ProductEntity product where product.price= (select max(product.price) from ProductEntity product)"),
		@NamedQuery(name = "getTotalprice", query = "select sum(product.price) from ProductEntity product"),
//		@NamedQuery(name = "getByNameLike", query = "select product.name from ProductEntity where product.name like :lik%"),
		@NamedQuery(name = "getQuantityByname", query = "select product.quantity from ProductEntity as product where product.name =:quan"),
		@NamedQuery(name = "getQuantityAndPriceByName", query = "select product.quantity,product.price from ProductEntity as product where product.name =:name"),
		@NamedQuery(name = "getQuantityAndPriceByNameAndId", query = "select product.quantity,product.price from ProductEntity as product where product.name =:name and product.id =:id"),
		@NamedQuery(name = "getBrandByName", query = "select product.brand from ProductEntity as product where product.name=:brand"),
		@NamedQuery(name = "getByBrand", query = "select product from ProductEntity as product where product.name=:brand"),
		@NamedQuery(name = "getNameAndPrice", query = "select product.name,product.price from ProductEntity as product"),
		@NamedQuery(name = "getNameAndPriceByBrand", query = "select product.name,product.price from ProductEntity as product where product.brand=:brand")

})
public class ProductEntity {

	@Id
	@Column(name = "p_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "p_name")
	private String name;
	@Column(name = "p_quantity")
	private int quantity;
	@Column(name = "p_brand")
	private String brand;
	@Column(name = "p_price")
	private double price;
	@Column(name = "p_rating")
	private float rating;

	public ProductEntity(String name, int quantity, String brand, double price, float rating) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.brand = brand;
		this.price = price;
		this.rating = rating;
	}

}
