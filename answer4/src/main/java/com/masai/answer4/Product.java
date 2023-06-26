package com.masai.answer4;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
 private int id;
	
 private String name;
 private int price;
 private String Category;
 private int Stockquantity;
 @OneToMany(mappedBy = "product")
 private List<OrderDetail> orderdetails;
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(String name, int price, String category, int stockquantity) {
	super();
	this.name = name;
	this.price = price;
	Category = category;
	Stockquantity = stockquantity;
}
public int getId() {
	return id;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getCategory() {
	return Category;
}
public void setCategory(String category) {
	Category = category;
}
public int getStockquantity() {
	return Stockquantity;
}
public void setStockquantity(int stockquantity) {
	Stockquantity = stockquantity;
}
 
 
 
 
 
	
	

}
