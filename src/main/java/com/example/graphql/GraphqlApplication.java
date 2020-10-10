package com.example.graphql;

import com.example.graphql.model.SportCar;
import graphql.kickstart.tools.SchemaParserDictionary;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlApplication.class, args);
	}

	@Bean
	public SchemaParserDictionary schemaParserDictionary() {
		return new SchemaParserDictionary()
//				.add(ChildOne.class)
				.add(SportCar.class);
	}

}
