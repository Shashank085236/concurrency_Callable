package com.example.async;

import java.util.Random;
import java.util.concurrent.Callable;

public class Task implements Callable<Result> {

	@Override
	public Result call() throws Exception {
		return performTask();
	}

	private Result performTask() {
		Result result = new Result();
		result.setTime(System.currentTimeMillis());
		result.setMessage(getMessage());
		return result;
	}

	private String getMessage(){
		// assume this take time,so implementing a delay
		Random rand = new Random();
		int  n = rand.nextInt(5000) + 1;
		try {
			
			synchronized (this) {
				wait(n);
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return "message obtained after delay: "+n+"ms.";
		
	}
}
