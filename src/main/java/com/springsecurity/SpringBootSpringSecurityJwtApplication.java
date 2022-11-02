package com.springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.*")
public class SpringBootSpringSecurityJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSpringSecurityJwtApplication.class, args);
	}

}
