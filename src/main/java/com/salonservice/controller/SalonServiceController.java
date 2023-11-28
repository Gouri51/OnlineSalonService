package com.salonservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salonservice.bean.SalonService;
import com.salonservice.bean.SalonServiceDTO;
import com.salonservice.service.ISalonService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class SalonServiceController {
       
	    @Autowired
		private ISalonService isalonService;
		
		@PostMapping("salonserviceOld/{cid}")
		public SalonService addSalonService(@RequestBody SalonService salon,@PathVariable("cid") Integer cid) {
			return this.isalonService.addSalonServiceByCid(salon,cid);
			
		}
		
		@PostMapping("salonservice")
		public SalonService addSalonService(@RequestBody SalonServiceDTO salonserviceDto) {
			return this.isalonService.addSalonService(salonserviceDto);
			
		}
		
		@GetMapping("salonservices")
		public List<SalonService> getAllSalonServices(){
			return this.isalonService.getAllServices();

		}
}