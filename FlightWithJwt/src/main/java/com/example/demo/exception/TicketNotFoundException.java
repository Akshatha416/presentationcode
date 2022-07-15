package com.example.demo.exception;

public class TicketNotFoundException extends Exception {
	
	public TicketNotFoundException() {}
	public TicketNotFoundException(String message) {
		super(message);
		
	}
	public TicketNotFoundException(Exception message) {
		super(message);
		
	}
	

	public TicketNotFoundException(String message,Exception e) {
		super(message,e);
		
	}


}
