package com.springmvc.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(UserNotFoundException.class)
	public ModelAndView myExceptionHandlingMethod(UserNotFoundException ue)
	{
		ModelAndView mv= new ModelAndView();
		mv.setViewName("exceptionPage");
		mv.addObject("excep",ue);
		return mv;
	}

}
