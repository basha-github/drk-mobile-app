package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Mobile;
import com.example.demo.repo.LaptopRepo;

@Service
public class MobileService {

	@Autowired
	LaptopRepo xyz;

	public void saveIntoDB(Mobile newMobile) {

		xyz.save(newMobile);

	}

	public String updateExistingMobile(Mobile updatedMobile) {
		// TODO Auto-generated method stub
		String res = "successfully updated "+updatedMobile.getImei();
		Mobile oldMobile = null;
		try {
			oldMobile = xyz.findById(updatedMobile.getImei()).get();

		} catch (Exception e) {
			res = "mobile not found "+updatedMobile.getImei();
		}

		if (oldMobile != null) {
			xyz.save(updatedMobile);

		}
		return res;

	}

}
