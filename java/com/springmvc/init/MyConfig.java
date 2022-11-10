package com.springmvc.init;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.springmvc.beans.EmployeeRegister;

@Configuration
@ComponentScan(basePackages= {"com.springmvc.controller","com.springmvc.dao","com.springmvc.exceptions","com.springmvc.init"})
@EnableWebMvc
public class MyConfig {
	
	@Bean
	public ViewResolver getViewResolver()
	{
		InternalResourceViewResolver vr=new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/jsps/");
		vr.setSuffix(".jsp");
		return vr;
	}
	@Bean
	public List<EmployeeRegister> getEmployeeDetails()
	{
		List<EmployeeRegister> arr= new ArrayList<>();
		return arr;
	}

}
