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
	public String directorydetail(DirectoryDTO directoryDTO, Model model ) {
		System.out.println("invoked directory");
		System.out.println(directoryDTO);
		DirectoryEntity directoryEntity= new DirectoryEntity(directoryDTO.getName(),
				directoryDTO.getMobileNo(), directoryDTO.getAddress(), directoryDTO.getLandmark()
				, directoryDTO.getLandlineNum(), directoryDTO.getCity(), directoryDTO.getPincode());
		
		boolean save= directoryService.validateAndSave(directoryEntity);
		
		if(save) {
			System.out.println("directory is saved "+directoryDTO.getName());
			model.addAttribute("directory is saved succefully");
		}else {
			System.err.println("directory is not saved "+directoryDTO.getName());
			model.addAttribute("directory is not saved ");
		}
		return "/DirectoryRegister.jsp";
			
		
	
	}
	
}
