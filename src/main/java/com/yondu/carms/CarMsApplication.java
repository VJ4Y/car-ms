package com.yondu.carms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.yondu.carms.domain.Car;
import com.yondu.carms.domain.Owner;
import com.yondu.carms.repository.CarRepository;
import com.yondu.carms.repository.OwnerRepository;

@SpringBootApplication
public class CarMsApplication {
	@Autowired
	CarRepository carRepository;
	@Autowired
	OwnerRepository ownerRepository; 
	static Logger logger=LoggerFactory.getLogger(CarMsApplication.class);
	public static void main(String[] args) {
		//lets check if app is restarting and and 
		SpringApplication.run(CarMsApplication.class, args);
		logger.info("In Main");
		
	}
	
	@Bean
	CommandLineRunner runner(){
		return args->{
			
			Owner o1=new Owner("Bat", "Man");
			ownerRepository.save(o1);
			carRepository.save(new Car("BMW", "black", "Z4", 10, "ABC123", 2018, o1));
			};
	}
}
