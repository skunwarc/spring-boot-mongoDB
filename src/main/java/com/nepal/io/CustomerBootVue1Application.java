package com.nepal.io;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class CustomerBootVue1Application {

	public static void main(String[] args) {
		SpringApplication.run(CustomerBootVue1Application.class, args);
	}

}
