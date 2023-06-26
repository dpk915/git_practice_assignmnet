package com.masai.answer4;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private double phone;
	@OneToMany(mappedBy = "customer" ,cascade = CascadeType.ALL)
	private List<Orders> list =new ArrayList<>();
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getPhone() {
		return phone;
	}
	public void setPhone(double phone) {
		this.phone = phone;
	}
	public int getId() {
		return id;
	}
	public Customer(String name, String email, double phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	
	
	
	

}
