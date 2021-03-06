package com.uek223.firstgraphqlapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@EnableNeo4jRepositories
public class FirstgraphqlappApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstgraphqlappApplication.class, args);
	}

}
