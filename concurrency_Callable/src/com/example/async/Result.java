package com.example.async;

import java.sql.Timestamp;

public class Result {
	
	private String message;
	private long time;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Timestamp getTime() {
		return new Timestamp(time);
	}
	public void setTime(long time) {
		this.time = time;
	}
	
	public String toString(){
		return "[ time: "+getTime()+", message: "+getMessage()+"]";
	}
}
