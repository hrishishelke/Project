package com.emp.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Address_detail implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
		
	@NotNull
	@Pattern(regexp="^[A-Za-z]")
	private String country;

	@NotNull
	@Pattern(regexp="^[A-Za-z]")
	private String state;
	
	@NotNull
	@Pattern(regexp="^[A-Za-z]")
	private String city;
	
	@NotNull
	@Pattern(regexp="^[A-Za-z]")
	private String district;
	
	@NotNull
	@Pattern(regexp="^[0-9]")
	private String pincode;
	
	@NotNull
	@Pattern(regexp="^[A-Za-z0-9]")
	private String temp_address;

	@NotNull
	@Pattern(regexp="^[A-Za-z0-9]")
	private String permn_address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getTemp_address() {
		return temp_address;
	}

	public void setTemp_address(String temp_address) {
		this.temp_address = temp_address;
	}

	public String getPermn_address() {
		return permn_address;
	}

	public void setPermn_address(String permn_address) {
		this.permn_address = permn_address;
	}
	
	
	
}
