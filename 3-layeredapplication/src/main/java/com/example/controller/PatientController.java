package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.model.Patient;
import com.example.service.PatientService;

@Controller("patientcontroller")
public class PatientController {

	@Autowired
	private PatientService ps;
	
	public List<Patient> getPatientsbylocation(String location1,String location2,String location3){
		List<Patient> p=ps.getPatientDetails(location1, location2, location3);
		return p;
	}
}
