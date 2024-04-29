package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.*;
import org.springframework.context.annotation.ComponentScan;

import com.example.controller.PatientController;
import com.example.model.Patient;

@SpringBootApplication
@ComponentScan(basePackages={"com.example.controller","com.example.service","com.example.dao"})
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(Application.class, args);
		PatientController pc=ctx.getBean("patientcontroller",PatientController.class);
		List<Patient>ls=pc.getPatientsbylocation("hyderabad","bangalore","chennai");
		System.out.println(ls);
		((ConfigurableApplicationContext) ctx).close();
		
	}

}
