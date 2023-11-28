package com.salonservice.service;

import java.util.List;

import com.salonservice.bean.Appointment;
import com.salonservice.exception.AppointmentNotFoundException;

public interface IAppointmentService {

	public Appointment addAppointment(Appointment appointment) throws AppointmentNotFoundException;
	public Appointment removeAppointment(long id); 
	public Appointment updateAppointment(long id, Appointment appointment);
	public Appointment getAppointment(long id);
	public List<Appointment> getAllAppointments(); 
	public List<Appointment> getOpenAppointments();
	Appointment updateAppointment(Appointment appointment) throws AppointmentNotFoundException;
	Appointment getAppointmentById(Integer id) throws AppointmentNotFoundException;
	List<Appointment> getAllAppointment();
	Appointment deleteAppointmentById(Integer id) throws AppointmentNotFoundException;
}

