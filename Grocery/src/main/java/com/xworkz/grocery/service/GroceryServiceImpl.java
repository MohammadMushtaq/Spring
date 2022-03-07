package com.xworkz.grocery.service;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.xworkz.grocery.dto.GroceryDTO;
import com.xworkz.grocery.entity.GroceryEntity;
import com.xworkz.grocery.repository.GroceryRepository;

@Service
public class GroceryServiceImpl implements GroceryService {
	
	private GroceryRepository groceryRepository;
	private GroceryDTO groceryDTO;
	
	public GroceryServiceImpl(GroceryRepository groceryRepository) {
		this.groceryRepository = groceryRepository;
		System.out.println("invoked service");
	}
	@Override
	public boolean validateAndSave(GroceryEntity groceryEntity) {
		double s;
		boolean valid= false;
		if(groceryEntity.getName()!=null) {
			System.out.println("valid name");
		valid=true;
		}
		else {
			System.out.println("not a valid name");
			return valid;
		}
		if(groceryEntity.getPrice()!=0 ) {
			System.out.println("price is valid");
			 valid=true;
			}
			else {
				System.out.println("price is null");
				return valid;
			}
		if(groceryEntity.getBrand()!=null) {
			System.out.println("valid brand");
			 valid=true;
			}
			else {
				System.out.println("not a valid brand");
				return valid;
			}
		if(groceryEntity.getQuantity()!=0 ) {
			System.out.println("valid quantity");
			valid=true;
			}
			else {
				System.out.println("not a valid quantity");
				return valid;
			}
		if(groceryEntity.getType()!=null ) {
			System.out.println(" valid type");
			valid= true;
			}
			else {
				System.out.println("not a valid type");
				return valid;
			}
		
		if(valid=true) {
			this.groceryRepository.save(groceryEntity);
			System.out.println("valid service detail");
			valid=true;
		}
		else {
			System.err.println("not a valid data");
			return valid;
		}
	
		return true; 
	}
	
	@Override
	public GroceryDTO validateAndFindByName(String name) {
		boolean valid= false;
		if(name!=null) {
			System.out.println("valid name");
		
		}
		else {
			System.out.println("not a valid name");
			valid= false;
		}
		if(valid=true) {
		GroceryEntity entity= this.groceryRepository.findByName(name);
		GroceryDTO dto= new GroceryDTO();
		BeanUtils.copyProperties(entity, dto);
		return dto;
		}else {
			System.out.println("not valid data");
		 valid=false;
		}
		return GroceryService.super.validateAndFindByName(name);
	}
	
	@Override
	public GroceryDTO validateAndUpdateByName(String name) {
		
		if(validateAndFindByName(groceryDTO.getName()).equals(validateAndUpdateByName(name))){
			GroceryEntity entity= this.groceryRepository.updateByName(groceryDTO.getName(),
			groceryDTO.getQuantity(), groceryDTO.getPrice(), groceryDTO.getType(), groceryDTO.getBrand());
			GroceryDTO dto= new GroceryDTO();
			BeanUtils.copyProperties(entity, dto);
			return dto;
			}else {
				System.out.println("not valid data");
			}
		return GroceryService.super.validateAndUpdateByName(name);
	}

}
