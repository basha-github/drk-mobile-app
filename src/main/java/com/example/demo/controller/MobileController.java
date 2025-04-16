package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Mobile;
import com.example.demo.service.MobileService;

@RestController
public class MobileController {
	
	@Autowired
	MobileService abc;
	
	@PostMapping("/bigc/mobile/add")
	public String addNewMobile(@RequestBody Mobile newMobile) {
		
		
		abc.saveIntoDB(newMobile);
		
		return "Successfully added into the db";
		
	}

	@PutMapping("/bigc/mobile/update")
	public String updateMobile(@RequestBody Mobile updatedMobile) {
		
		
		return abc.updateExistingMobile(updatedMobile);
		
		
	}
	
	
	
	
	
	
	
}
