package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class FlightsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightsApplication.class, args);
	}
	//@Bean
	//public Docket productApi() {
	//return new Docket(DocumentationType.SWAGGER_2).select()
	//.apis(RequestHandlerSelectors.basePackage("com.example.demo")).build();	}

}
