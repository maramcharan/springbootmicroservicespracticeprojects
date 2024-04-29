package com.example.hoteldetails;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hotel")
public class Hotel {
	
	@Value("Udupi upahar")
	private String hotelname;
	
	@Value("${HotelLocation}")
	private String hotellocation;
	
	@Value("${HotelPhone}")
	private String phone;
	
	@Value("#{menu.idlyprice+menu.dosaprice}")
	private int idlydosacombo;

	@Override
	public String toString() {
		return "Hotel [hotelname=" + hotelname + ", hotellocation=" + hotellocation + ", phone=" + phone
				+ ", idlydosacombo=" + idlydosacombo + "]";
	}

	
	
}
