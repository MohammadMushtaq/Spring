package com.xworkz.grocery.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.PersistenceException;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
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
		boolean valid = false;
		if (groceryEntity.getName() != null) {
			System.out.println("valid name");
			valid = true;
		} else {
			System.out.println("not a valid name");
			return valid;
		}
		if (groceryEntity.getPrice() != 0) {
			System.out.println("price is valid");
			valid = true;
		} else {
			System.out.println("price is null");
			return valid;
		}
		if (groceryEntity.getBrand() != null) {
			System.out.println("valid brand");
			valid = true;
		} else {
			System.out.println("not a valid brand");
			return valid;
		}
		if (groceryEntity.getQuantity() != 0) {
			System.out.println("valid quantity");
			valid = true;
		} else {
			System.out.println("not a valid quantity");
			return valid;
		}
		if (groceryEntity.getType() != null) {
			System.out.println(" valid type");
			valid = true;
		} else {
			System.out.println("not a valid type");
			return valid;
		}

		if (valid = true) {
			this.groceryRepository.save(groceryEntity);
			System.out.println("valid service detail");
			valid = true;
		} else {
			System.err.println("not a valid data");
			return valid;
		}

		return false;
	}

	@Override
	public GroceryDTO validateAndFindByName(String name) {
		boolean valid = false;
		if (name != null) {
			System.out.println("valid name");

		} else {
			System.out.println("not a valid name");
			valid = false;
		}
		if (valid = true) {
			GroceryEntity entity = this.groceryRepository.findByName(name);
			GroceryDTO dto = new GroceryDTO();
			BeanUtils.copyProperties(entity, dto);
			return dto;
		} else {
			System.out.println("not valid data");
			valid = false;
		}
		return GroceryService.super.validateAndFindByName(name);
	}

	@Override
	public GroceryDTO validateAndUpdateByName(String name, int quantity, double price, String type, String brand) {

		boolean valid = false;
		if (name != null) {
			System.out.println("valid name");
			valid = true;
		} else {
			System.out.println("not a valid name");
			valid = false;
		}
		if (price != 0) {
			System.out.println("price is valid");
			valid = true;
		} else {
			System.out.println("price is null");
			valid = false;
		}
		if (brand != null) {
			System.out.println("valid brand");
			valid = false;
		} else {
			System.out.println("not a valid brand");
			valid = false;
		}
		if (quantity != 0) {
			System.out.println("valid quantity");
			valid = true;
		} else {
			System.out.println("not a valid quantity");
			valid = false;
		}
		if (type != null) {
			System.out.println(" valid type update");
			valid = true;
		} else {
			System.out.println("not a valid type");
			valid = false;
		}

		if (valid = true) {
			GroceryEntity groceryEntity = new GroceryEntity();
			groceryEntity.setName(name);
			groceryEntity.setPrice(price);
			groceryEntity.setQuantity(quantity);
			groceryEntity.setBrand(brand);
			groceryEntity.setType(type);
			this.groceryRepository.updateByName(groceryEntity);

			System.out.println("valid service detail");
			valid = true;
		} else {
			System.err.println("not a valid data");
			valid = false;
		}

		return GroceryService.super.validateAndUpdateByName(name, quantity, price, type, brand);
	}

	@Override
	public List<Object> getAllNewspapaer() {
		boolean valid = false;
		System.out.println("invoked get all grocery in service");
		GroceryEntity groceryEntity = new GroceryEntity();

		List<GroceryEntity> groList = this.groceryRepository.getAllGrocery();
		if (groList != null) {
			List<Object> groceryContainer = new ArrayList<Object>(groList);
			Iterator<Object> itr = groceryContainer.iterator();
			while (itr.hasNext()) {
				Object object = (Object) itr.next();
				System.out.println(object);
			}
			return groceryContainer;

		} else {
			System.out.println("no valid get all");
		}

		return GroceryService.super.getAllNewspapaer();
	}
	@Override
	public boolean deleteGrocery(String name) {
		
		System.out.println("invoked delete service");
		if(name!=null) {
			this.groceryRepository.deleteGroceryByName(name);
			return true;
		}else {
			System.out.println("invalid data");		
		}	
		return GroceryService.super.deleteGrocery(name);
	}
	
}
