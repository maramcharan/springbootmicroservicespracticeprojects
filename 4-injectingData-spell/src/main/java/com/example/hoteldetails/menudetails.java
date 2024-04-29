package com.example.hoteldetails;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("menu")
@Data
public class menudetails {
	
	@Value("${IdlyPrice}")
	private int idlyprice;
	
	@Value("${DosaPrice}")
	private int dosaprice;
	
	@Value("${WadaPrice}")
	private int wadaprice;

}
