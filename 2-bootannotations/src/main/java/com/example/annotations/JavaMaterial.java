package com.example.annotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("javamaterial")

public class JavaMaterial implements Material {

	@Override
	public void materialname() {
		// TODO Auto-generated method stub
		System.out.println("This is a java material");
		
	}
	

}
