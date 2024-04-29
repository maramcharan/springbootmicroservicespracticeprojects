package com.example.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	
	@Autowired
	@Qualifier("phpmaterial")
	private Material m1;
	
	public void getmaterial() {
		m1.materialname();
	}
	
	

}
