package com.salonservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salonservice.bean.Appointment;
import com.salonservice.dao.AppointmentRepository;
import com.salonservice.exception.AppointmentNotFoundException;
@Service
public class IAppointmentServiceImpl implements IAppointmentService {

	@Autowired
	private AppointmentRepository appointmentRepo;
	
	@Override
	public Appointment addAppointment(Appointment appointment) throws AppointmentNotFoundException {
	
		return this.appointmentRepo.save(appointment);
	}

	@Override
	public Appointment updateAppointment(Appointment appointment) throws AppointmentNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Appointment getAppointmentById(Integer id) throws AppointmentNotFoundException {
		
		Optional<Appointment> appointmentOpt = this.appointmentRepo.findById(id);
		if(appointmentOpt.isEmpty())
			throw new AppointmentNotFoundException("Appointment Not Found");
		
		return appointmentOpt.get();
	}

	@Override
	public Appointment deleteAppointmentById(Integer id) throws AppointmentNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Appointment> getAllAppointment() {
		
		return this.appointmentRepo.findAll();
	}

	@Override
	public Appointment removeAppointment(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Appointment updateAppointment(long id, Appointment appointment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Appointment getAppointment(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Appointment> getAllAppointments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Appointment> getOpenAppointments() {
		// TODO Auto-generated method stub
		return null;
	}

}
