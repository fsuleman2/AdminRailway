package com.train.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.train.model.TrainDetails;
import com.train.repository.AdminDao;
import com.train.service.ServiceAdmin;

@Service
public class ServiceAdminImpl implements ServiceAdmin {
    @Autowired
    private AdminDao admindao;
	@Override
	public TrainDetails createTrain(TrainDetails traindetails) {
		admindao.save(traindetails);
		return null;
	}

}
