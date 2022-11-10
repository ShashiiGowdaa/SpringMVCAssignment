package com.springmvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springmvc.beans.EmployeeRegister;

@Component("edao")
public class EmployeeDao {
	
	@Autowired
	private List<EmployeeRegister> empr;
	
	public String addEmployeeDetails(EmployeeRegister e)
	{
		empr.add(e);
		return "Inserted Successfully";
		
	}
	public EmployeeRegister getEmployeebyUsername(String username)
	{
		for(EmployeeRegister temp:empr)
		{
			if(temp.getUsername().equals(username))
			return temp;
			
		}
		return null;
	}
	public EmployeeRegister getEmployeebyPassword(String pwd)
	{
		for(EmployeeRegister temp:empr)
		{
			if(temp.getPwd().equals(pwd))
			return temp;
			
		}
		return null;
	}
}
