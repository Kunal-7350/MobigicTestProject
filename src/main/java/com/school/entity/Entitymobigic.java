package com.school.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Entitymobigic {

	@Id
	int username;
	
	String address;

	public int getUsername() {
		return username;
	}

	public void setUsername(int username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Entitymobigic [username=" + username + ", address=" + address + "]";
	}
	
	
}
