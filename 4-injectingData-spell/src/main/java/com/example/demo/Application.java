package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.context.*;
import org.springframework.context.annotation.ComponentScan;

import com.example.hoteldetails.Hotel;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan(basePackages="com.example.hoteldetails")
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(Application.class, args);
		
		Hotel h1=ctx.getBean("hotel",Hotel.class);
		System.out.println(h1.toString());
		((ConfigurableApplicationContext) ctx).close();
		
	}

}
