package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.PatientDao;
import com.example.model.Patient;

@Service("patientservice")
public class PatientService implements IServicePatient{
	
	@Autowired
	private PatientDao pdao;

	@Override
	public List<Patient> getPatientDetails(String location1, String location2, String location3) {
		// TODO Auto-generated method stub
		List<Patient> l=pdao.getPatients(location1, location2, location3);
		
		
		return l;
	}

}
