package com.in28minutes.rest.webservices.restfulwebservices;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class RestfulWebServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebServicesApplication.class, args);
	}
	
	//http://localhost:3000/ to 8080
	//Cross Origin Requests
	//Allow all requests only from http://localhost:3000/

	// Cross Origin Requests
	// Allow requests only from a specific frontend URL
	@Value("${frontend.url}")
	private String frontendUrl;
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
					.allowedMethods("*") // Allow all HTTP methods
					//.allowedOrigins("*");//#CHANGE //NOT RECOMMENDED FOR PRODUCTION

//					.allowedOrigins("http://localhost:3000");
					.allowedOrigins(frontendUrl); // Origin injected from application.properties
			}
		};
	}

}
