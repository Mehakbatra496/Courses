package com.dto_practice.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.dto_practice.courses.model.Course;
import com.dto_practice.courses.repository.CourseRepository;
import com.dto_practice.courses.service.CourseService;

@SpringBootApplication //@Configuration + @ComponentScan + @Auto-Configuration
public class CoursesApplication {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context=	SpringApplication.run(CoursesApplication.class, args);
	 // it will created IOC container that will manage the lifecycle of the 1. bean creation 2. dependency injected
		
		
	}
	
	
	
	@Bean
	CommandLineRunner run(CourseRepository repo) {
		
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      		
	    return args -> {
	        Course c = new Course();
	        c.setTitle("Spring Boot (runner interface)");
	        c.setInstructor("Ankush Yadav");
	        c.setCategory("New Category");
	        c.setLevel("");
	        c.setDurationInHours(3);
	        c.setCreatedAt(null);
	        
	        repo.save(c);
	        
	        
	    };
	}

}

