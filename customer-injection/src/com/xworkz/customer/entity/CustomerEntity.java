package com.xworkz.customer.entity;
	
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

import lombok.Data;
	
	@Entity
	@Data
	@Table(name="customer")
	public class CustomerEntity {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "Id")
	private int cId;
		@Column(name = "C_name")
	private String cName;
		@Column(name = "C_location")
	private String cLocation;
		@Column(name = "C_email")
	private String email;
		@Column(name = "C_mobile")
	private long mobile;
		@Column(name = "C_premium")
	private boolean premium;
		@Column(name = "C_age")
	private int age;
		public CustomerEntity(String cName, String cLocation, String email, long mobile, boolean premium, int age) {
			super();
			this.cName = cName;
			this.cLocation = cLocation;
			this.email = email;
			this.mobile = mobile;
			this.premium = premium;
			this.age = age;
		}

	


}
