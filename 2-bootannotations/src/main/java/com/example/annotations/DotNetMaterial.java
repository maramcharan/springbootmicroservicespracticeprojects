package com.example.annotations;

import org.springframework.stereotype.Component;

@Component("dotnetmaterial")
public class DotNetMaterial implements Material{

	@Override
	public void materialname() {
		// TODO Auto-generated method stub
		System.out.println("This is a DotNet Material");
	}
	

}
