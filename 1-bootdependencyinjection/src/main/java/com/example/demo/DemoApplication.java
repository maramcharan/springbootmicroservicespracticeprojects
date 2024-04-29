package com.example.demo;

import java.time.LocalDate;
import org.springframework.context.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {
	
	@Bean(name="gl")
	public LocalDate getlocal() {
		return LocalDate.now();
	}

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(DemoApplication.class, args);
		Season ob=ctx.getBean("season",Season.class);
		ob.getseason();
		((ConfigurableApplicationContext) ctx).close();
		
	}

}
