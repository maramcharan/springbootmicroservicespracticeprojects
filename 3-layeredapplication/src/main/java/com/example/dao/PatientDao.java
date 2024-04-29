package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.model.Patient;

@Repository("patientdao")
public class PatientDao implements IDaoPatient{
	
	@Autowired
	private DataSource ds;
	
	private  static final String GET_PATIENTS_DETAILS="select * from patientdetails where location in(?,?,?) order by location";

	@Override
	public List<Patient> getPatients(String location1, String location2, String location3) {
		// TODO Auto-generated method stub
		List<Patient> l1=new ArrayList<>();
		
		try {
			Connection conn=ds.getConnection();
			PreparedStatement st=conn.prepareStatement(GET_PATIENTS_DETAILS);
			st.setString(1, location1);
			st.setString(2, location2);
			st.setString(3, location3);
			ResultSet rs=st.executeQuery();
			while(rs.next()) {
				Patient p1= new Patient();
				p1.setPatientName(rs.getString("patientname"));
				p1.setPatientId(rs.getInt("patientId"));
				p1.setLocation(rs.getString("location"));
				p1.setAge(rs.getInt("age"));
				
				l1.add(p1);
			}
			
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return l1;
	}
	

}
