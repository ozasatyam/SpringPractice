package com.springDemo.annotation;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
private String[] data= {"be aware of your girlfriend might be cheating","million dollar will soon seen in your bank account", "WE are Fuking fake service" };
	
private Random rd = new Random();
@Override
	public String getFortunre() {
		return data[rd.nextInt(data.length)];
		
	}

}
