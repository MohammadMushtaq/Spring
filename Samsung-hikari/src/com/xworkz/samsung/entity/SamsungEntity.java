package com.xworkz.samsung.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity(name="samsung")
public class SamsungEntity {

	@Id
	@Column (name="sid")
	private int id;
	@Column (name="smodel")
	private String model;
	@Column (name="sbranch")
	private int branch;
	@Column (name="sprice")
	private double price;
	@Column (name="sorignal")
	private boolean orignal;
	@Column (name="screatedby")
	private String createdBy;
	
	public SamsungEntity(int id, String model, int branch, double price, boolean orignal,String createdBy) {
		super();
		this.id = id;
		this.model = model;
		this.branch = branch;
		this.price = price;
		this.orignal = orignal;
		this.createdBy=createdBy;
	}
	
	
}
