package com.menaka.demo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AbCcompanyApplication {

	public static void main(String[] args) {

		SpringApplication.run(AbCcompanyApplication.class, args);
	}

	//config the modelMapper
	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}
}
