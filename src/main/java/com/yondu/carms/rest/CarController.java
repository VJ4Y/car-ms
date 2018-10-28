package com.yondu.carms.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yondu.carms.domain.Car;
import com.yondu.carms.services.CarService;

@CrossOrigin
@RestController
public class CarController {
	
	@Autowired
	CarService carService;
	
	@RequestMapping("/getCar")
	private Optional<Car> getCarById(@RequestParam(value="id") int id){
		System.out.println("in getCarby id"); 
		Optional<Car> car=carService.getCarInfo(id);
		System.out.println("in controller");
		
		return car;
	}

}
