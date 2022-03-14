package com.xworkz.grocery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.grocery.dto.GroceryDTO;
import com.xworkz.grocery.service.GroceryService;

@Controller
@RequestMapping("/")
public class GroceryGetAllGroceryController {

	@Autowired
	private GroceryService groceryService;
	
	public GroceryGetAllGroceryController() {
		System.out.println("invoked get all grocery in controller ");
	}
	
	@RequestMapping("/getAllGrocery.do")
	public String onGetAllGrocery(Model model) {
		System.out.println("invoked on get method");
		
		
		List<Object> list= this.groceryService.getAllNewspapaer();
		
		model.addAttribute("ListOfGrocery",list);
		
		model.addAttribute("message", "a valid grocery");
		
		return "/GetAll.jsp";
	}
}