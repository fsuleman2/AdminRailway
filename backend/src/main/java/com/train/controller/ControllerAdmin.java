package com.train.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.train.model.TrainDetails;
import com.train.service.ServiceAdmin;

@RestController
@CrossOrigin
public class ControllerAdmin {

	@Autowired
	private ServiceAdmin serviceAdmin;
	
	//methods//
	@PostMapping("/train/add")
	public TrainDetails createCustomer(TrainDetails traindetails) {
		TrainDetails cs = this.serviceAdmin.createTrain(traindetails);
		return cs;
	}
	
}
