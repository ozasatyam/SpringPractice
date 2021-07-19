package com.springDemo.annotation;


public class SwimCoach implements Coach {

	private FortuneService fortuneservice;
	
	public SwimCoach(FortuneService fortuneservice) {
		this.fortuneservice = fortuneservice;
	}
	@Override
	public String dailyWorkout() {
		
		return "Swim daily";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneservice.getFortunre();
	}

}
