package com.yondu.carms.domain;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Bus {
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private String busId;
	private String busName;
	private String busType;
	
	
	
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
}
