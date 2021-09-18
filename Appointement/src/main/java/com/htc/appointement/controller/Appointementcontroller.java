package com.htc.appointement.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.htc.appointement.entity.Appiontement;


@RestController
@RequestMapping("/api")
public class Appointementcontroller {

	
	@Autowired
	private com.htc.appointement.persistence.AppointementInterface appointementInterface;
	
	
	@GetMapping("/appointement/{appointementId}") 
	public Appiontement getAppointementById(@PathVariable Long appointementId) {
		Appiontement Appointement =null;
	
		Appointement=appointementInterface.findById(appointementId).get();
		return Appointement;
	
	}
	
	@PostMapping("/addappointement") 
	public Appiontement createProduct(@RequestBody Appiontement appointement) {
		   
		 return appointementInterface.save(appointement);
		 
	}
	
	 @GetMapping("/doctors")
	  public List<Appiontement> getAllDoctordetails() {
	   
	    List<Appiontement> list = new ArrayList<>();
	    Iterable<Appiontement> customers = appointementInterface.findAll();
	 
	    customers.forEach(list::add);
	    return list;
	  }
	
	
}
