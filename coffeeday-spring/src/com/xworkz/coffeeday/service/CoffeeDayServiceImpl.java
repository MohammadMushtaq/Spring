package com.xworkz.coffeeday.service;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.coffeeday.entity.CoffeeDayEntity;
import com.xworkz.coffeeday.repository.CoffeeDayRepository;


@Component
public class CoffeeDayServiceImpl implements CoffeeDayService {
@Autowired
	private CoffeeDayRepository CoffeeDayRepository;
	
	public CoffeeDayServiceImpl(CoffeeDayRepository CoffeeDayRepository) {
		this.CoffeeDayRepository=CoffeeDayRepository;
	}
	
	
	@Override
	public boolean saveAndValidate(CoffeeDayEntity entity) {
		boolean valid= false;
		if(entity.getLocation()!=null && entity.getLocation().length()>5) {
			System.out.println("entity" +entity.getLocation());
			valid=true;
		}else {
			System.err.println("invalid location"); 
			return false;
		}
		if(entity.getOwner()!=null && entity.getOwner().length()>3) {
			System.out.println(entity.getOwner());
			valid=true;
		}else {
			System.err.println("invalid getOwner"); 
			return false;
		}
		LocalDate nw= LocalDate.now();
		if(entity.getStartedDate()!=null && entity.getStartedDate().isBefore(nw)) {
			System.out.println(entity.getStartedDate());
			valid=true;
		}else {
			System.err.println("invalid getStartedDate"); 
			return false;
		}
		
		LocalTime open= LocalTime.of(9, 15);
		if(entity.getOpenTime()!=null && entity.getOpenTime().isAfter(open)) {
			System.out.println(entity.getOpenTime());
			valid=true;
		}else {
			System.err.println("invalid getOpenTime"); 
			return false;
		}
		LocalTime close= LocalTime.of(6, 15);
		if(entity.getCloseTime()!=null && entity.getCloseTime().isBefore(close)) {
			System.out.println(entity.getCloseTime());
			valid=true;
		}else {
			System.err.println("invalid close time"); 
			return false;
		}
		if(valid=true) {
			System.out.println("its save to db");
			this.CoffeeDayRepository.save(entity);
		}
		else {
			System.out.println("invalid data");
			return false;
		}
		
		
		return valid;
	}

}
