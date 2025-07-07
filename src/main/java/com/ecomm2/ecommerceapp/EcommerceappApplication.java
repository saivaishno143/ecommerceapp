package com.ecomm2.ecommerceapp;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EcommerceappApplication {
//	Dotenv dotenv = Dotenv.configure().load();// Load environment variables from .env file




	public static void main(String[] args) {
		SpringApplication.run(EcommerceappApplication.class, args);
	}

}
