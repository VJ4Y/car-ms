package com.yondu.carms.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String brand;
	private String color;
	private String model;
	private int price;
	private String reg_number;
	private int year;
	@ManyToOne
	@JsonIgnoreProperties(value={"handler","hibernateLazyInitializer"})
	@JoinColumn(name="owner")
	private Owner owner;
	
	
	public Car() {
	}
	
	public Car(String brand, String color, String model, int price, String reg_number, int year, Owner owner) {
		super();
		this.brand = brand;
		this.color = color;
		this.model = model;
		this.price = price;
		this.reg_number = reg_number;
		this.year = year;
		this.owner=owner;
	}

	public int getId() {
		return id;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getColor() {
		return color;
	}

	public String getModel() {
		return model;
	}

	public int getPrice() {
		return price;
	}

	public String getReg_number() {
		return reg_number;
	}

	public int getYear() {
		return year;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setReg_number(String reg_number) {
		this.reg_number = reg_number;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public Owner getOwner() {
		return owner;
	}
	
	@Override
	public String toString() {
			
		return ""+getId()+" "+getModel()+" "+getBrand()+" "+getColor()+" "+getPrice()+" "+getReg_number()+" "+getYear()+"*************";
	}
	
}

