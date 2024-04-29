package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.annotations.Student;

@SpringBootApplication
@ComponentScan("com.example.annotations")
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(Application.class, args);
		
		
		Student s1=ctx.getBean("student",Student.class);
		
		s1.getmaterial();
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
