package com.salonservice.service;

import java.util.List;

import com.salonservice.bean.SalonService;
import com.salonservice.bean.SalonServiceDTO;
import com.salonservice.exception.SalonServiceNotFoundException;

public interface ISalonService {

	SalonService addSalonServiceDto = null;
	public SalonService addService(SalonService salonService);
	public SalonService removeService(long id);
	public SalonService updateService(long id, SalonService salonService);
	public SalonService getService(long id);
	public List<SalonService> getAllServices();
	public List<SalonService> getServiceByPrice();
	public List<SalonService> getServiceByDuration();
	public List<SalonService> getAllSalonService();
	public SalonService addSalonServiceByCid(SalonService salon, Integer cid);
	public SalonService addSalonService(Object salonDto);
	SalonService updateSalonService(SalonService salonservice) throws SalonServiceNotFoundException;
    SalonService addSalonService(SalonServiceDTO SalonServiceDTO);
	SalonService getSalonServiceById(Integer id) throws SalonServiceNotFoundException;
	List<SalonService> getAllSalonServices();
	
			
	
}
