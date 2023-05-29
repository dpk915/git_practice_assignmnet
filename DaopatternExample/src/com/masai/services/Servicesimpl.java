package com.masai.services;

import java.util.List;

import com.masai.dao.DaoImpl;
import com.masai.dao.Daointerface;
import com.masai.dto.Medicine;
import com.masai.exceptions.NoRecordFoundException;
import com.masai.exceptions.SomethingWentWrongException;

public class Servicesimpl implements Iservice {

	@Override
	public void addmedicineser(Medicine m) throws SomethingWentWrongException {
		Daointerface d= new DaoImpl();
		d.insertmedicinedao(m);
		
	}

	@Override
	public void updatemedicine(Medicine m) throws SomethingWentWrongException {
		Daointerface d= new DaoImpl();
		d.updatemedicinedao(m);
		
	}

	@Override
	public void deletemedicine(String m) throws SomethingWentWrongException {
	
		Daointerface d= new DaoImpl();
		d.deletemedicinedao(m);
	}

	@Override
	public List<Medicine> viewall() throws SomethingWentWrongException, NoRecordFoundException {
		Daointerface d= new DaoImpl();
		return d.viewalldao();
	}
	
	  public Medicine findbyid(String s) throws SomethingWentWrongException, NoRecordFoundException{
		  Daointerface d= new DaoImpl();
		  Medicine a=null;
		  try {
		 a= d.viewalldao().stream().filter(x->x.getId().equals(s)).findFirst().orElse(null);
	  }
		  catch(SomethingWentWrongException e) {
			  
		  }
		  return a;
	  }
	  

}
