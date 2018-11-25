package com.yondu.carms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.yondu.carms.domain.Car;
import com.yondu.carms.domain.Owner;
import com.yondu.carms.domain.User;
import com.yondu.carms.repository.CarRepository;
import com.yondu.carms.repository.OwnerRepository;
import com.yondu.carms.repository.UserRepository;

@SpringBootApplication
public class CarMsApplication {
	@Autowired
	CarRepository carRepository;
	@Autowired
	OwnerRepository ownerRepository; 
	@Autowired	
	private UserRepository urepository;
	
	static Logger logger=LoggerFactory.getLogger(CarMsApplication.class);
	public static void main(String[] args) {
		//lets check if app is restarting and and 
		SpringApplication.run(CarMsApplication.class, args);
		logger.info("In Main");
		
	}
	
//	@Bean
//	public WebMvcConfigurer corsConfigurer(){
//		return new WebMvcConfigurerAdapter(){
//			public void addCorsMapping(CorsRegistry registry){
//				registry.addMapping("/**");
//				}
//			};
//	}
	
	@Bean
	CommandLineRunner runner(){
		return args->{
			
			Owner o1=new Owner("Bat", "Man");
			ownerRepository.save(o1);
			carRepository.save(new Car("BMW", "black", "Z4", 10, "ABC123", 2018, o1));
			
			urepository.save(new User("user", "$2a$04$1.YhMIgNX/8TkCKGFUONWO1waedKhQ5KrnB30fl0Q01QKqmzLf.Zi", "USER"));
			urepository.save(new User("admin", "$2a$04$KNLUwOWHVQZVpXyMBNc7JOzbLiBjb9Tk9bP7KNcPI12ICuvzXQQKG", "ADMIN"));
			};
			
	}
	
}
