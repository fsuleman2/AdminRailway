package com.train.service;

import java.util.List;

import com.train.model.TrainDetails;

public interface ServiceAdmin {
	public TrainDetails createTrain(TrainDetails traindetails);

	public List<TrainDetails> getAllTrains();
}
