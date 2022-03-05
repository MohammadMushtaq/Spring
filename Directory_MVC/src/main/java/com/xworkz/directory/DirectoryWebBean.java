package com.xworkz.directory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.directory.Entity.DirectoryEntity;
import com.xworkz.directory.service.DirectoryService;


@Component
@RequestMapping("/")
public class DirectoryWebBean {

	@Autowired
	private DirectoryService directoryService;
	
	public DirectoryWebBean() {
		System.out.println("invoked bean");
	}
	@RequestMapping("/dir.do")
	public String save(DirectoryDTO dto, Model model) {
		System.out.println("invoked phone directory method");
		System.out.println(dto);
		DirectoryEntity entity = new DirectoryEntity(dto.getName(), dto.getMobileNo(), dto.getAddress(), dto.getLandmark(),
				dto.getLandlineNum(), dto.getCity(), dto.getPincode());
		boolean valid = directoryService.validateAndSave(entity);
		if(valid) {
			System.out.println("dir saved successfully "+dto.getName());
			model.addAttribute("message", "directory is saved sucessfully");
		}
		else {
			System.err.println("dir not saved successfully "+dto.getName());
			model.addAttribute("message", "directory is not saved sucessfully");
		}
		
		
		return "/DirectoryRegister.jsp";
	}
	
}
