package com.example.demo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("season")
public class Season {
	
	@Autowired
	LocalDate date;
	
	public void getseason() {
		int monthvalue=date.getMonthValue();
		
		if(monthvalue<5) {
			System.out.println("this is a summer season");
		}else if(monthvalue>5&&monthvalue<=9) {
			System.out.println("this is a rainy season");
		}else {
			System.out.println("This is a winter season");
		}
	}

}
