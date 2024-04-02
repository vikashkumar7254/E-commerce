package com.ecom;

import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
public class EcomBackendApplication implements CommandLineRunner  {

	public static void main(String[] args) {
		SpringApplication.run(EcomBackendApplication.class, args);  
	}
	@Bean
	public ModelMapper mapper() {
		return new ModelMapper();  
	}

	@Override
	public void run(String... args) throws Exception {

	}

}
   