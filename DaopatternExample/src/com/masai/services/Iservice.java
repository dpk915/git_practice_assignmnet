package com.masai.services;

import java.util.List;

import com.masai.dto.Medicine;
import com.masai.exceptions.NoRecordFoundException;
import com.masai.exceptions.SomethingWentWrongException;

public interface Iservice {
	
	void addmedicineser(Medicine m) throws SomethingWentWrongException;
     void updatemedicine(Medicine m) throws SomethingWentWrongException;
     void deletemedicine(String m) throws SomethingWentWrongException;
     List<Medicine> viewall() throws SomethingWentWrongException,NoRecordFoundException;

     public Medicine findbyid(String s) throws SomethingWentWrongException, NoRecordFoundException;
     
}
