package com.xworkz.grocery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.grocery.dto.GroceryDTO;
import com.xworkz.grocery.entity.GroceryEntity;
import com.xworkz.grocery.service.GroceryService;

@Controller
@RequestMapping("/")
public class GroceryUpdateController {

	@Autowired
	private GroceryService groceryService;

	public GroceryUpdateController() {
		System.out.println("invoked update");
	}

	@RequestMapping("update.do")
	public String ScanAndUpdate(@RequestParam String name, Model model) {
		System.out.println("invoked update controller method");

//		GroceryEntity entity = new GroceryEntity(groceryDTO.getName(), groceryDTO.getQuantity(), groceryDTO.getPrice(),
//				groceryDTO.getType(), groceryDTO.getBrand(), groceryDTO.getTotal());

		GroceryDTO update = groceryService.validateAndUpdateByName(name);
		
//		if (update != null) {
			model.addAttribute("grocery", update);

			double total = (update.getQuantity() * update.getPrice());
			model.addAttribute("totalprice", "Total price :  " + total);
//		} else {
//			model.addAttribute("grocery", "grocery not found");
//		}

		return "/UpdateItem.jsp";
	}

}
