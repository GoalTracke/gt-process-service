package com.goaltracke.gtprocessservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class GtProcessServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GtProcessServiceApplication.class, args);
	}

}
