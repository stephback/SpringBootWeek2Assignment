package com.promineotech.jeep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//SpringBootApplication is a combo-annotation that tells SpringBoot JeepSales is configuration class
@SpringBootApplication
public class JeepSales {

	public static void main(String[] args) {
		SpringApplication.run(JeepSales.class, args);	//Boots Spring Application
	}
}
