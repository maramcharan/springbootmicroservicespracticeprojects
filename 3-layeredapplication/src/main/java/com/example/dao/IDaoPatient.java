package com.example.dao;

import java.util.List;

import com.example.model.Patient;

public interface IDaoPatient {

	public List<Patient> getPatients(String location1,String location2,String location3);
}
