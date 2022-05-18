package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.web.config.SortHandlerMethodArgumentResolverCustomizer;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		ApplicationContext context;
		context=SpringApplication.run(DemoApplication.class, args);
	 studentRepository=context.getBean(studentRepository.class);
		// cereate row
		student st= new student(100,"abc");
	stud.save(st);
System.out.print("Record saves");
	}
}


	


