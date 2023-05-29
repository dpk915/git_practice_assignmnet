package com.masai.ui;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.masai.dto.Medicine;
import com.masai.exceptions.NoRecordFoundException;
import com.masai.exceptions.SomethingWentWrongException;
import com.masai.services.Iservice;
import com.masai.services.Servicesimpl;

public class Main {
	public static void insertMedicine(Scanner sc) {
		System.out.println("Enter MedicineID ");
		String id=sc.next();
		System.out.println("Enter  MedicineName");
		String name=sc.next();
		System.out.println("Enter  Medicine company name");
		String company=sc.next();
		System.out.println("Enter  Medicine price per unit");
		double price=sc.nextDouble();
		System.out.println("Enter   mfg date in YYYY-MM-DD format");
		LocalDate mfgdate=LocalDate.parse(sc.next());
		System.out.println("Enter  exp date in YYYY-MM-DD format");
		LocalDate expdate=LocalDate.parse(sc.next());
		
		Medicine med=new Medicine(id,name,company,price,mfgdate,expdate);
		Iservice s=new Servicesimpl();
		try {
		
			s.addmedicineser(med);
			System.out.println("Data added Succesfully");
		}
		catch(SomethingWentWrongException e) {
			System.out.println(e.getMessage());
		}
		}
	public static void updatemedicine(Scanner sc) {
		System.out.println("Enter MedicineID which you want to update");
		String id=sc.next();
		System.out.println("Enter updated  MedicineName");
		String name=sc.next();
		System.out.println("Enter Updated  Medicine company name");
		String company=sc.next();
		System.out.println("Enter Updated  Medicine price per unit");
		double price=sc.nextDouble();
		System.out.println("Enter Updated  mfg date in YYYY-MM-DD format");
		LocalDate mfgdate=LocalDate.parse(sc.next());
		System.out.println("Enter Update exp date in YYYY-MM-DD format");
		LocalDate expdate=LocalDate.parse(sc.next());
		
		Medicine med=new Medicine(id,name,company,price,mfgdate,expdate);
		Iservice s=new Servicesimpl();
		try {
		
			s.updatemedicine(med);
			
		}
		catch(SomethingWentWrongException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void deletemedicine(Scanner sc) {
		System.out.println("Enter medicine id to delete");
		String id=sc.next();
		Iservice s=new Servicesimpl();
		try {
			s.deletemedicine(id);
		}
		 catch (SomethingWentWrongException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void viewallmedicine() {
		Iservice s=new Servicesimpl();
		try {
		List<Medicine> m=s.viewall();
		System.out.println(m.size());
		m.forEach(System.out::println);
		}
		 catch (SomethingWentWrongException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoRecordFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    public static void viewbymedicineid(Scanner sc) throws NoRecordFoundException {
    	
    	System.out.println("Enter your id to serch medicine");
    	String scc=sc.next();
    	Iservice s=new Servicesimpl();
    	try {
    		System.out.println(s.findbyid(scc));
    	}
    	catch(SomethingWentWrongException e) {
    		//throw new NoRecordFoundException("data not found");
    	}
    	
    	
    	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws NoRecordFoundException {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("1. Insert medicine");
			System.out.println("2. View all medicine");
			System.out.println("3. Update Medicine details");
			System.out.println("4. Delete medicine");
			System.out.println("5. search medicine by id");
			System.out.println("6. search medicine by expiry date");
			System.out.println("0. for exit");
			System.out.print("Enter Selection ");
			choice = sc.nextInt();
			switch(choice) {
				case 1:
					insertMedicine(sc);
					break;
				case 2:
					viewallmedicine();
					break;
				case 3:
					updatemedicine(sc);
					break;
				case 4:
				deletemedicine(sc);
					break;
				case 5:
					viewbymedicineid(sc);
				case 0:
					System.out.println("Thanks for using our services");
					break;
				default:
					System.out.println("Invalid Selection, try again");
			}
		}while(choice != 0);
		sc.close();
	}
}
