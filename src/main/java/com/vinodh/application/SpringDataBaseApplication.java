package com.vinodh.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.vinodh.*")
@EntityScan("com.vinodh.model")	
@EnableJpaRepositories(basePackages = "com.vinodh.repository")
public class SpringDataBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataBaseApplication.class, args);
	}

}
