package com.yondu.carms.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDetail {
	@Id
	private String id;
	private String name;
	private String password;
	private String mobileNo;
	private String emailId;
	private String type;
	
	public UserDetail() {
		// TODO Auto-generated constructor stub
	}
	
	public UserDetail(String id, String name, String password, String mobileNo, String emailId, String type) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getType() {
		return type;
	}
	
	
}
