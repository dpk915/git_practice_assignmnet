package com.masai.answer4;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class OrderDetail {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private int id;
	private int quantity;
	@OneToOne
	private Orders order;
	
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;

	public OrderDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderDetail(int quantity, Orders order, Product product) {
		super();
		this.quantity = quantity;
		this.order = order;
		this.product = product;
	}

	public int getId() {
		return id;
	}

	

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	
	

}
