package com.yondu.carms.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Station {
	@Id
	private int stationId;
	private String stationName;
	private String subStation;
	
	
	
//	private double station_latitude;
//	private double station_longitude;

	public int getStationId() {
		return stationId;
	}

	public void setStationId(int station_id) {
		this.stationId = station_id;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String station_name) {
		this.stationName = station_name;
	}
	
	public String[] getSubStation() {
		return subStation.split(",");
	}

//	public double getStation_latitude() {
//		return station_latitude;
//	}
//
//	public void setStation_latitude(double station_latitude) {
//		this.station_latitude = station_latitude;
//	}
//
//	public double getStation_longitude() {
//		return station_longitude;
//	}
//
//	public void setStation_longitude(double station_longitude) {
//		this.station_longitude = station_longitude;
//	}
}
