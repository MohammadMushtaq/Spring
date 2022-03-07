package com.xworkz.grocery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.grocery.dto.GroceryDTO;
import com.xworkz.grocery.service.GroceryService;

@Controller
@RequestMapping("/")
public class GrocerySearchController {

	@Autowired
	private GroceryService groceryService;
	
	public GrocerySearchController() {
		System.out.println("invoked search");
	}
	
	@RequestMapping("search.do")
	public String searchName(@RequestParam String name,Model model) {
		
		GroceryDTO dto= this.groceryService.validateAndFindByName(name);
		
		if(dto!=null) {
			model.addAttribute("grocery", dto);
			double total=(dto.getQuantity()*dto.getPrice());
			model.addAttribute("totalprice", "Total price :  "+total);
		}else {
			model.addAttribute("grocery", "grocery not found");
		}
		
		return "/Searchitem.jsp";
		
	}
}
