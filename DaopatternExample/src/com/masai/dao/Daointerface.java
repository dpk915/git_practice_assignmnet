package com.masai.dao;

import java.util.List;

import com.masai.dto.Medicine;
import com.masai.exceptions.NoRecordFoundException;
import com.masai.exceptions.SomethingWentWrongException;

public interface Daointerface {
  void insertmedicinedao(Medicine m) throws SomethingWentWrongException;
  void updatemedicinedao(Medicine m) throws SomethingWentWrongException;
  void deletemedicinedao(String s) throws SomethingWentWrongException;
  List<Medicine> viewalldao() throws SomethingWentWrongException,NoRecordFoundException;

}
