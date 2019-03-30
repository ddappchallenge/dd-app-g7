package com.ddth.challenge.shtp.model;

import java.util.Date;

import javax.xml.crypto.Data;

public class ResponseMessage {
	private String message;
	private String status;
	private Date date;

	public void setMessage(String message) {
		this.message = message;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public String getStatus() {
		return status;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
