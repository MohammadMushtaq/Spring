package com.xworkz.gold.util;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table (name="gold_deatils")
public class GoldEntity {
	@Id
	@Column(name="g_id")
	private int id;
	@Column(name="g_carrot")
	private Double Carraot;
	@Column(name="g_mix")
	private Double mixQuantiy;
	@Column(name="g_purity")
	private double purity;
	@Column(name="g_gold")
	private boolean gold;
	@Column(name="g_price")
	private double goldPriceFor10Gm;
	
	
	public GoldEntity(int id, Double carraot, Double mixQuantiy, double purity, boolean gold, double goldPriceFor10Gm) {
		super();
		this.id = id;
		Carraot = carraot;
		this.mixQuantiy = mixQuantiy;
		this.purity = purity;
		this.gold = gold;
		this.goldPriceFor10Gm = goldPriceFor10Gm;
	}


}
