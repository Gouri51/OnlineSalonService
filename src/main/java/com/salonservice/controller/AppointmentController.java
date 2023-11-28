package com.salonservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salonservice.bean.Appointment;
import com.salonservice.exception.AppointmentNotFoundException;
import com.salonservice.service.IAppointmentService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class AppointmentController {

	   @Autowired
		private IAppointmentService iappointmentService;
		
		@PostMapping("appointment")
		public Appointment addAppointment(@RequestBody Appointment appointment) throws AppointmentNotFoundException {
			return this.iappointmentService.addAppointment(appointment);
		}
		
		@GetMapping("appointments")
		public List<Appointment> getAllAppointment(){
			return this.iappointmentService.getAllAppointments();
		}
		@GetMapping("appointment/{id}")
		public Appointment getappointmentById(@PathVariable("id") Integer appointmentId ) throws AppointmentNotFoundException {
			return this.iappointmentService.getAppointment(appointmentId);
		}
}