package com.htc.doctormanagement;

import java.time.LocalDate;

import org.jboss.jandex.Main;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import com.htc.doctormanagement.dao.AppointmentInterface;
import com.htc.doctormanagement.entity.Appointment;

@SpringBootTest
class DoctormanagementApplicationTests {
	@Autowired
	AppointmentInterface appointmentInterface;

	private void Main() {
		// TODO Auto-generated method stub
		testAppointment();

	}
	
	@Test
	public  void testAppointment() {
		Appointment appointment = new Appointment();
		appointment.setAppointmentId(1L);
		appointment.setAppointmentDate(LocalDate.now());
		appointment.setDoctorId(2L);
		
		appointmentInterface.save(appointment);
		
		assertNotNull(appointmentInterface.findById(1L).get());
	}


}
