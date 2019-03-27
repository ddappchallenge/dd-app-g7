package com.ddth.challenge.shtp.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.annotation.PostConstruct;

@ControllerAdvice
public class GlobalExceptionHandler {
	@PostConstruct
	public void start(){
		System.out.println("Start Global Exception handler");
	}

	@ResponseBody
	@ExceptionHandler(MissingServletRequestParameterException.class)
	public String handleParameterNotmatch(MissingServletRequestParameterException error){

		System.out.println("MissingServletRequest");
		return error.getMessage();
	}

	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(Exception.class)
	public String handleAll(){
		System.out.println("Exception Handler");
		return "Error";
	}

}
