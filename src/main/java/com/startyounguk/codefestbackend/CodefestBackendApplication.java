package com.startyounguk.codefestbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class CodefestBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodefestBackendApplication.class, args);
	}

}
