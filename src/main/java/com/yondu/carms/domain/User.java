package com.yondu.carms.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class User {
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false,updatable=false)
	private Long Id;
	
	@Column(nullable=false,unique=true)
	private String userName;
	
	@Column(nullable=false)
	private String password;
	
	@Column(nullable=false)
	private String role;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String userName,String password,String role){
		super();
		this.userName=userName;
		this.password=password;
		this.role=role;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
