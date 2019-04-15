package com.yondu.carms.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Bus {
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private String busId;
	private String busName;
	private String busType;
	
	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="source_station")
	private Station sourceStation;

	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="destination_station")
	private Station destinationStation;
	
		
	public Bus() {
	}
	
	public Bus(String busId, String busName, String busType) {
		super();
		this.busId = busId;
		this.busName = busName;
		this.busType = busType;
	}

	public String getBusId() {
		return busId;
	}

	public String getBusName() {
		return busName;
	}

	public String getBusType() {
		return busType;
	}

	public Station getSourceStation() {
		return sourceStation;
	}

	public void setSourceStation(Station sourceStation) {
		this.sourceStation = sourceStation;
	}

	public Station getDestinationStation() {
		return destinationStation;
	}

}
