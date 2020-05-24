package com.abhishek.student.exception;

import java.time.LocalDateTime;

public class ErrorMessage {

	String status;
	String message;
	LocalDateTime datetime;
	
	public ErrorMessage() {
		
	}
	public ErrorMessage(String status, String message, LocalDateTime datetime) {
		super();
		this.status = status;
		this.message = message;
		this.datetime = datetime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LocalDateTime getDatetime() {
		return datetime;
	}
	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}
	
	
}
