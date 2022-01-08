package com.javalabs.cloudfunctions.springcloudfunctionshelloworld;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCloudFunctionsHelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFunctionsHelloworldApplication.class, args);
	}

	@Bean
	public Function<String, String> hello() {
		Function<String, String> function = (input) -> {
			return "Hello " + input;
		};
		
		return function;
	}
}
