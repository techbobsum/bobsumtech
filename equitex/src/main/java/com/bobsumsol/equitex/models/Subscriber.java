package com.bobsumsol.equitex.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subscriber {
	@Id
	@GeneratedValue(strategy=(GenerationType.IDENTITY))
	private long id;
	@Column(nullable=false, unique=true, length=20)
	private String username;
	@Column(nullable=false, length=64)
	private String password;
	
	private FullName name;
	@Column(nullable=false, unique=true, length=50)
	private String email;
	private String phone;
	private String address;
	private String city;
	private String country;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public FullName getName() {
		return name;
	}
	public void setName(FullName name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	

}
