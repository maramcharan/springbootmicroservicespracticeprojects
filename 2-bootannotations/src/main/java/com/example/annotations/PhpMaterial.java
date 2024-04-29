package com.example.annotations;

import org.springframework.stereotype.Component;

@Component("phpmaterial")
public class PhpMaterial implements Material {

	@Override
	public void materialname() {
		// TODO Auto-generated method stub
		System.out.println("This is a PHP material");
		
	}

}
