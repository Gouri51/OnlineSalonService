package com.salonservice.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salonservice.bean.Appointment;
import com.salonservice.bean.SalonService;
import com.salonservice.bean.SalonServiceDTO;
import com.salonservice.dao.AppointmentRepository;
import com.salonservice.dao.SalonServiceRepository;
import com.salonservice.exception.SalonServiceNotFoundException;

@Service
public class ISalonServiceImpl implements ISalonService{
@Autowired
private SalonServiceRepository salonserviceRepo;
@Autowired
private AppointmentRepository appointmentRepo;

@Override
public SalonService addSalonServiceByCid(SalonService salonservice, Integer cid)  {
	Optional<Appointment> appointmentOpt = this.appointmentRepo.findById(cid);
	//do the exception handling
	Appointment appointment = appointmentOpt.get();
	salonservice.setAppointment(appointment); // set salonservice to existing appointment

	return this.salonserviceRepo.save(salonservice);
}


		

	@Override
	public SalonService getSalonServiceById(Integer id) throws SalonServiceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SalonService  updateSalonService (SalonService  salonservice ) throws SalonServiceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SalonService> getAllSalonServices() {

		return this.salonserviceRepo.findAll();
	}

	@Override
	public SalonService  addSalonService (SalonServiceDTO salonserviceDTO) {
		Optional<Appointment> appointmentOpt = this.appointmentRepo.findById(salonserviceDTO.getId());

		// do the exception handling

		Appointment appointment = appointmentOpt.getId();
		SalonService  salonservice  = new SalonService(salonserviceDTO.getServiceId(), salonserviceDTO.getServiceName(), salonserviceDTO.getPrice(), salonserviceDTO.getDiscount(),
				salonserviceDTO.getDuration());
		
		return this.salonserviceRepo.save(salonservice);
	}




	@Override
	public SalonService addService(SalonService salonService) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public SalonService removeService(long id) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public SalonService updateService(long id, SalonService salonService) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public SalonService getService(long id) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public List<SalonService> getAllServices() {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public List<SalonService> getServiceByPrice() {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public List<SalonService> getServiceByDuration() {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public List<SalonService> getAllSalonService() {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public SalonService addSalonService(Object salonDto) {
		// TODO Auto-generated method stub
		return null;
	}
}

