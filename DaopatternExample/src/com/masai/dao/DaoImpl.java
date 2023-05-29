package com.masai.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

import com.masai.dto.Medicine;
import com.masai.exceptions.NoRecordFoundException;
import com.masai.exceptions.SomethingWentWrongException;
import com.masai.utilities.DButilities;




public class DaoImpl implements Daointerface {

	@Override
	public void insertmedicinedao(Medicine m) throws SomethingWentWrongException {
		try(Connection con=DButilities.createconnection()) {
			String query="INSERT INTO medicine VALUES (?,?,?,?,?, ?)";
	PreparedStatement	ps=	con.prepareStatement(query);
	ps.setString(1, m.getId());
	ps.setString(2, m.getName());
	ps.setString(3, m.getCompany_name());
	ps.setDouble(4, m.getPrice_per_unit());
	ps.setDate(5, Date.valueOf(m.getMfg_date()));
	ps.setDate(6, Date.valueOf(m.getExp_Date()));
	
	ps.executeUpdate();
	
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		//throw new SomethingWentWrongException("unable to add data");
	
	}

}

	@Override
	public void updatemedicinedao(Medicine m) throws SomethingWentWrongException {
		try(Connection con=DButilities.createconnection()) {
			String query = "UPDATE medicine SET name = ?, company = ?, price_per_unit = ?, MfgDate = ?, ExpDate = ? WHERE med_id = ?";
	PreparedStatement	ps=	con.prepareStatement(query);
	ps.setString(6, m.getId());
	ps.setString(1, m.getName());
	ps.setString(2, m.getCompany_name());
	ps.setDouble(3, m.getPrice_per_unit());
	ps.setDate(4, Date.valueOf(m.getMfg_date()));
	ps.setDate(5, Date.valueOf(m.getExp_Date()));
	int data=ps.executeUpdate();
	if(data==0)System.out.println("No record available ");
	
	
		}
		catch(SQLException e) {
			//System.out.println(e.getMessage());
		throw new SomethingWentWrongException("unable to update data");
	
	}
		
	}

	@Override
	public void deletemedicinedao(String s) throws SomethingWentWrongException {
		try(Connection con=DButilities.createconnection()){
			String deleteQuery = "DELETE FROM medicine WHERE med_id = ?";
		PreparedStatement ps=con.prepareStatement(deleteQuery);
		ps.setString(1, s);
		ps.executeUpdate();
		}
		catch(SQLException e) {
			throw new SomethingWentWrongException("unable to delete data");

		}
		
	}

	@Override
	public List<Medicine> viewalldao() throws SomethingWentWrongException, NoRecordFoundException {
		List<Medicine> list=null;
		try(Connection con=DButilities.createconnection()){
			String deleteQuery = "SELECT * FROM medicine order by name";
	PreparedStatement ps=con.prepareStatement(deleteQuery);
	ResultSet rs =	ps.executeQuery();
	if(DButilities.isResultSetEmpty(rs)) {
		throw new NoRecordFoundException("unable to delete data");
		}
	list=new ArrayList<Medicine>();
	while(rs.next()) {
		Medicine m=new Medicine(rs.getString(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getDate(5).toLocalDate(),rs.getDate(6).toLocalDate());
		list.add(m);
	}
	}
		catch(SQLException e) {
			throw new SomethingWentWrongException("unable to delete data");

		}
		
		return list;

	}
}
   
