package com.masai;

public class Service {
	
	private Database db;

	public Service(Database db) {
		super();
		this.db = db;
	}
	
	
public void printconnection() {
	System.out.println(db.getconnection());
}
}
