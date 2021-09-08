package com.htc.patient.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.htc.patient.entity.Patient;

public interface PatientInterface extends JpaRepository<Patient, Long>{
	
	@Query(value = "SELECT * FROM patient1 WHERE patient_first_name=?1",nativeQuery = true)
	public Patient findByPatientfirstname(String patientFirstName);
   
	@Query(value = "SELECT * FROM patient1 WHERE patient_last_name=?1",nativeQuery = true)
	public Patient findByPatientlastname(String patientLastName);
	
	@Query(value = "SELECT * FROM patient1 WHERE phone_number=?1",nativeQuery = true)
	public Patient findByPhonenumber(Long phoneNumber);
}
