package com.ddth.challenge.shtp.controller;

import com.ddth.challenge.shtp.model.ResponseMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class SHTPController {

	public static String lastestMessage = "Hello World";

	@GetMapping(value = "/hello")
	public ResponseMessage helloGet(){
		ResponseMessage hm = new ResponseMessage();
		hm.setMessage(lastestMessage);
		hm.setStatus("200");
		return hm;
	}

	@PostMapping(value="/set-hello-message")
	public HttpStatus setResponseMessage(@RequestParam(value="message") String message){
		lastestMessage = message;
		return HttpStatus.OK;
	}
}