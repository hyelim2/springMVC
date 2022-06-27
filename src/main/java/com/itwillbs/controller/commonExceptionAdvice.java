package com.itwillbs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

//@ControllerAdvice : 컨트롤러에서 발생하는 모든 예외를 처리하는 객체
@ControllerAdvice
public class commonExceptionAdvice {

	private static final Logger log = LoggerFactory.getLogger(commonExceptionAdvice.class);

//http://localhost:8088/common(x)
//	@RequestMapping("/common")
	
//	@ExceptionHandler(Exception.class) : Exception 클래스를 다루는 동작
	
//	@ExceptionHandler(NullPointerException.class)
//	public String nullEx(Exception e) {
//		log.info(" nullEx() 호출");
//		log.info(e.getMessage());
//		return "";
//		
//	}
	
//	@ExceptionHandler(Exception.class)
//	public String common(Exception e, Model model) {
//		log.info(" common() 호출");
//		model.addAttribute("test", "Error!!!!");
//;		
//		return "commException";
//		
//	}
	
	@ExceptionHandler(Exception.class)
	public ModelAndView common(Exception e) {
		log.info(" common() 호출");
		e.printStackTrace();
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/commException");
//		mav.addObject("test", "Error!!!!");
		mav.addObject("exception", e);
		return mav;
		
	}
}
