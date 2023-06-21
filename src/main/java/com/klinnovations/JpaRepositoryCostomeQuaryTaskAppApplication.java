package com.klinnovations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.klinnovations.repo.UserRepository;

@SpringBootApplication
public class JpaRepositoryCostomeQuaryTaskAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt =
		SpringApplication.run(JpaRepositoryCostomeQuaryTaskAppApplication.class, args);
         UserRepository repo = ctxt.getBean(UserRepository.class);
         
         //System.out.println(repo.getClass().getName());
         
         
         
		
		
		
	}

}
