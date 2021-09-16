package com.htc.patient.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.htc.patient.entity.Patient;
import com.htc.patient.persistence.PatientInterface;


@RestController
@RequestMapping("/api")
public class PatientControler {
	
	@Autowired
	private PatientInterface patientInterface;
	
	
	@GetMapping("/patients/M2/{patientId}") 
	public Patient getPatientById(@PathVariable Long patientId) {
		Patient patient =null;
		patient=patientInterface.findById(patientId).get();
		return patient;
		
	}
//	
//	@GetMapping("/patientsupdate/{patientId}")
//	public Patient updateById(@PathVariable Long patientId) {
//		patient=patientInterface.u
//		return patient;
//	}
	
	@GetMapping("/patients")
	public List<Patient> getAllPatientss(){
		return patientInterface.findAll();
	}
	 @GetMapping("/patients/FirstName/{patientFirstName}")
		public Patient findByPatient_first_name(@RequestParam String patientFirstName) {

			return patientInterface.findByPatientfirstname(patientFirstName);
		}

	 @GetMapping("/patients/lastName/{patientLastName}")
		public Patient findByPatient_last_name(@RequestParam String patientLastName) {

			return patientInterface.findByPatientlastname(patientLastName);
		}

	 @GetMapping("/patients/phonenumber/{phoneNumber}")
		public Patient findByPhone_numbwe(@RequestParam Long phoneNumber) {

			return patientInterface.findByPhonenumber(phoneNumber);
		}

	
	
	@PostMapping("/addpatients") 
	public Patient createProduct(@RequestBody Patient patient) {
		   
		 return patientInterface.save(patient);
	}


	@DeleteMapping("/deletepatients/{patientId}")
	  void deletePatient(@PathVariable Long patientId) {
		patientInterface.deleteById(patientId);
	  }

	
	
}
