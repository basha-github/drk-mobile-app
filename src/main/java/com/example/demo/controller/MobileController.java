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
	
	/*
	 * 
	 * http://localhost:8080/bigc/mobile/add
	 * 
	 * {
		    "imei": "samsung-543543",
		    "brand": "Samsung",
		    "model": "Galaxy112233",
		    "price": 85000
		}
	 * 
	 * method---->post
	 * 
	 * 
	 */
	
	@PostMapping("/bigc/mobile/add")
	public String addNewMobile(@RequestBody Mobile newMobile) {
		
		
		abc.saveIntoDB(newMobile);
		
		return "Successfully added into the db";
		
	}

	
	/*
	 * http://localhost:8080/bigc/mobile/update
	 * 
	 * 
	 * {
		    "imei": "Viv0-imei-54654",
		    "brand": "Vivo",
		    "model": "Vivok34",
		    "price": 55000
        }	
	 * 
	 * method---->put
	 */
	@PutMapping("/bigc/mobile/update")
	public String updateMobile(@RequestBody Mobile updatedMobile) {
		
		
		return abc.updateExistingMobile(updatedMobile);
		
		
	}
	
	
	
	
	
	
	
}
