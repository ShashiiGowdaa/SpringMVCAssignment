package com.springmvc.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springmvc.beans.EmployeeRegister;
import com.springmvc.dao.EmployeeDao;
import com.springmvc.exceptions.UserNotFoundException;

@Component("es")
public class EmployeeService {
	
	@Autowired
	private EmployeeDao edao;
	
	public String addEmployee(EmployeeRegister user)
	{
		String msg= edao.addEmployeeDetails(user);
		return msg;
	}
	
	public String checkDetails(String user, String pwd)
	{
		EmployeeRegister euser= edao.getEmployeebyUsername(user);
		if(euser!=null && euser!=null)
			
			return "Authenticated User";
		else
			throw new UserNotFoundException("Wrong Credentials!!!");
		
	}
}
