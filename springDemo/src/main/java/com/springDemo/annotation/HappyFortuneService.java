package com.springDemo.annotation;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortunre() {
		return "Today is your Day";
	}

	

}
