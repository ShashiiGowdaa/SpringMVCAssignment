package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.beans.EmployeeRegister;
import com.springmvc.init.EmployeeService;


@Controller
public class MyController {
	
	@Autowired
	private EmployeeService es;
	
	@RequestMapping("/Home")
	public ModelAndView processHomeRequest()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Home");
		return mv;
	}
	@RequestMapping("/register")
	public ModelAndView processRegisterRequest()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Registration");
		return mv;
	}
	@RequestMapping("/registeration")
	public ModelAndView processRegisterAuthenticate(@ModelAttribute("employeeDetails") EmployeeRegister er)
	{
		ModelAndView mv=new ModelAndView();
		
		String msg= es.addEmployee(er);
		
		mv.addObject("message", msg);
		
		mv.setViewName("Sucess");
		
		return mv;
	}
	@RequestMapping("/sucess")
	public ModelAndView processHomeRequest1()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Home");
		return mv;
	}
	@RequestMapping("/login")
	public ModelAndView processLoginRequest()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Login");
		return mv;
	}
	@RequestMapping("/authenticate")
	public ModelAndView processLoginAuthenticate(@RequestParam("username")String user, @RequestParam("pwd")String pwd)
	{
		ModelAndView mv=new ModelAndView();
		
		String msg= es.checkDetails(user, pwd);
		
		mv.addObject("message",msg);
		
		mv.setViewName("UserAccount");
		
		return mv;
	}
	


}
