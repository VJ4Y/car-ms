package com.yondu.carms.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yondu.carms.domain.Car;
import com.yondu.carms.repository.CarRepository;

@Service
public class CarService {
	
	@Autowired
	CarRepository carRepository;
	
	public Optional<Car> getCarInfo(int id) {
		Optional<Car> c = carRepository.findOneById(id);
		System.out.println(c.get().toString());
		if (c.isPresent()){
			c.get().toString();
		}
		return c;
		
	}
}
