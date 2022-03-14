package com.xworkz.grocery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.grocery.dto.GroceryDTO;
import com.xworkz.grocery.service.GroceryService;

@Controller
@RequestMapping("/")
public class GroceryDeleteController {
	@Autowired
	private GroceryService groceryService;
	
	public GroceryDeleteController() {
		System.out.println("invoked delete controller");
	}
	
	@RequestMapping("delete.do")
	public String deleteGrocery(@RequestParam String name, Model model) {
		System.out.println("invoked delete method");
		
			boolean deleted= this.groceryService.deleteGrocery(name);
			if(deleted) {
				model.addAttribute("msg", "grocery is deleted");
			}
			else {
				model.addAttribute("msg", "grocery is not deleted");
			}
	
		return "/Delete.jsp";
	}
	
}
