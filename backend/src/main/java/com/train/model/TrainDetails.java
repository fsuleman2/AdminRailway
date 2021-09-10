package com.train.model;

<<<<<<< HEAD

=======
>>>>>>> 066bade831e2b0af9b8f825b401ecfb1971b8bd9
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Entity
@Component
@Data
public class TrainDetails {

	@Id
	@GeneratedValue
	private int tid; 
	private int tno;	 
	private String tname;	 
	private String start; 
	private String stop;
<<<<<<< HEAD
	
	//@JsonFormat(pattern = "yyyy-MM-dd")
=======
	@JsonFormat(pattern="yyyy-MM-dd")
>>>>>>> 066bade831e2b0af9b8f825b401ecfb1971b8bd9
	private Date date;	//take care of format
	
	private int totalCoach;	 
	private int acSleeperCoach;	 
	private int acSittingCoach;	 
	private int nonAcSleeperCoach;
	private int nonAcSittingCoach;
	private int totalAcSleeperSeat;	
	private int availAcSleeperSeat;
	private int totalAcSittingSeat;
	private int availAcSittingSeat;
	private int totalNonAcSleeperSeat;
	private int availNonAcSleeperSeat;
	private int totalNonAcSittingSeat;
	private int availNonAcSittingSeat;

	
}
