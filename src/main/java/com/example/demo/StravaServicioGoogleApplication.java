package com.example.demo;

import org.springframework.boot.CommandLineRunner;  
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.slf4j.LoggerFactory;

import strava.dao.UserRepository;
import strava.entity.User;

@SpringBootApplication
public class StravaServicioGoogleApplication {
	private static final org.slf4j.Logger log = LoggerFactory.getLogger(StravaServicioGoogleApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(StravaServicioGoogleApplication.class, args);
	}
	
	@Bean
	CommandLineRunner demo(UserRepository repository) {
		return (args) -> {
			//Create some users
			repository.save(new User("Manu","1234"));
			
			log.warn("USER Service available and waiting ...");
		};
	}

}
