package com.train.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.train.model.TrainDetails;

public interface AdminDao extends JpaRepository<TrainDetails, Integer> {

}
