package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mobile {
	
	@Id
	private String imei;
	private String brand;
	private String model;
	private int price;
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobile(String imei, String brand, String model, int price) {
		super();
		this.imei = imei;
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
