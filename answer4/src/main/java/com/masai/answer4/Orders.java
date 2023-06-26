package com.masai.answer4;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
   // private LocalDate date;
    private String Status;
    
    @ManyToOne
    @JoinColumn(name = "cust_id")
    private Customer customer;
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
//	public Order(LocalDate date, String status) {
//		super();
//		this.date = date;
//		Status = status;
//	}
	public int getId() {
		return id;
	}
	
//	public LocalDate getDate() {
//		return date;
//	}
//	public void setDate(LocalDate date) {
//		this.date = date;
//	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", date=" + ", Status=" + Status + "]";
	}
    
    
    
}
