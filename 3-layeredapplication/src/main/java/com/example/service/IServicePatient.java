package com.example.service;

import java.util.List;

import com.example.model.Patient;

public interface IServicePatient {
	
	public List<Patient> getPatientDetails(String location1,String location2,String location3);

}
