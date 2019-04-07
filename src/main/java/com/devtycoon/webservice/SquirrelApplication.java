package com.devtycoon.webservice;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // JPA Auditing 활성화
@SpringBootApplication
public class SquirrelApplication {

	private static final String APPLCATION_LOCATIONS = "spring.config.location="
			+ "classpath:application.yml,"
			+ "/app/config/Squirrel/real-application.yml";

	public static void main(String[] args) {
		new SpringApplicationBuilder(SquirrelApplication.class)
				.properties(APPLCATION_LOCATIONS)
				.run(args);
	}
}
