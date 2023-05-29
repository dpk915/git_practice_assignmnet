package com.masai.dto;

import java.time.LocalDate;

public class Medicine {

	private String id;
	private String name;
	private String company_name;
	private double price_per_unit;
	private LocalDate mfg_date;
	private LocalDate exp_Date;
	public Medicine(String id, String name, String company_name, double price_per_unit, LocalDate mfg_date,
			LocalDate exp_Date) {
		super();
		this.id = id;
		this.name = name;
		this.company_name = company_name;
		this.price_per_unit = price_per_unit;
		this.mfg_date = mfg_date;
		this.exp_Date = exp_Date;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public double getPrice_per_unit() {
		return price_per_unit;
	}
	public void setPrice_per_unit(double price_per_unit) {
		this.price_per_unit = price_per_unit;
	}
	public LocalDate getMfg_date() {
		return mfg_date;
	}
	public void setMfg_date(LocalDate mfg_date) {
		this.mfg_date = mfg_date;
	}
	public LocalDate getExp_Date() {
		return exp_Date;
	}
	public void setExp_Date(LocalDate exp_Date) {
		this.exp_Date = exp_Date;
	}
	@Override
	public String toString() {
		return "Medicine [id=" + id + ", name=" + name + ", company_name=" + company_name + ", price_per_unit="
				+ price_per_unit + ", mfg_date=" + mfg_date + ", exp_Date=" + exp_Date + "]";
	}
	
	
	
}
