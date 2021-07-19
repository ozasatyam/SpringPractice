package com.springDemo.annotation;




public class SadFortuneService implements FortuneService {

	@Override
	public String getFortunre() {
		
		return "you are worst even choosing this service";
	}

}
