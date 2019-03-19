package com.ddth.hello.demo.controller;

import com.ddth.hello.demo.model.HelloMessage;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

	public static String lastestMessage = "Hello World";

	@GetMapping(value = "/hello")
	public HelloMessage helloGet(){
		HelloMessage hm = new HelloMessage();
		hm.setMessage(lastestMessage);
		hm.setStatus("200");
		return hm;
	}

	@PostMapping(value="/set-hello-message")
	public HttpStatus setHelloMessage(@RequestParam(value="message") String message){
		lastestMessage = message;
		return HttpStatus.OK;
	}
}
