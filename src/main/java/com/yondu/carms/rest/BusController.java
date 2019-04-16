package com.yondu.carms.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yondu.carms.domain.Bus;
import com.yondu.carms.repository.BusRepository;

@CrossOrigin
@RestController
public class BusController {
	@Autowired
	BusRepository busRepository;

	@RequestMapping("/getAllBuses")
	private Iterable<Bus> getCarById() {
		System.out.println("in getCarby id");
		Iterable<Bus> buses = busRepository.findAll();
		
		return buses;
	}

}
