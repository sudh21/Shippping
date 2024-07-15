package com.products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories

public class ListOfProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListOfProductsApplication.class, args);
	}

}
