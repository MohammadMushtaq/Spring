package com.xworkz.grocery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.grocery.dto.GroceryDTO;
import com.xworkz.grocery.entity.GroceryEntity;
import com.xworkz.grocery.service.GroceryService;

@Controller
@RequestMapping("/")
public class GroceryController {

	@Autowired
	private GroceryService groceryService;
	
	public GroceryController() {
		System.out.println("invoked bean");
	}

	@RequestMapping("/add.do")
	public String saveController(GroceryDTO groceryDTO, Model model) {

		System.out.println("invoked save controller method");

		GroceryEntity entity = new GroceryEntity(groceryDTO.getName(), groceryDTO.getQuantity(), groceryDTO.getPrice(),
				groceryDTO.getType(), groceryDTO.getBrand(), groceryDTO.getTotal());

			boolean saved =groceryService.validateAndSave(entity);
		
		if (!saved) {
			System.out.println("grocery is saved");
			model.addAttribute("message", "grocery is saved sucessfully");
			model.addAttribute("grocery", groceryDTO);

			double price = groceryDTO.getPrice() * groceryDTO.getQuantity();
			model.addAttribute("totalprice", "total price : " + price);
			System.err.println("~~~~~~~~~~~~~~~~~~~~~~ corr");
		} 
		else {
			System.out.println("data is not saved");
			model.addAttribute("message", "grocery not saved");
			System.err.println("~~~~~~~~~~~~~~~~~~~~~~ errr");

		}
		return "/AddItemResult.jsp";
	}

}
