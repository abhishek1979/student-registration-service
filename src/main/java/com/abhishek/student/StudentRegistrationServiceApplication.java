package com.abhishek.student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class StudentRegistrationServiceApplication extends SpringBootServletInitializer implements CommandLineRunner{

	Logger logger = LoggerFactory.getLogger(StudentRegistrationServiceApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(StudentRegistrationServiceApplication.class, args);
	}

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(StudentRegistrationServiceApplication.class);
    }
	
	@Override
	public void run(String... args) throws Exception {
		logger.info("Status : {}","StudentRegistrationServiceApplication is running now.");
		
	}

	
}
