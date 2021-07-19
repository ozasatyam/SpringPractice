package com.springDemo.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	//@Autowired
	//@Qualifier("randomFortuneService")
	
	@Value("hi")
	private String st;
	private FortuneService fortuneservice; 
	
	//no need for setter AutoWired will do it in field by using java refletion
	
	  @Autowired

	  public TennisCoach (@Qualifier("randomFortuneService") FortuneService fortuneservice) {
	  this.fortuneservice = fortuneservice; 
	  }
	 
	/*
	 * @Autowired public void crazyFunction(FortuneService fortuneservice) {
	 * this.fortuneservice = fortuneservice; }
	 */

	@Override
	public String dailyWorkout() {

		return "Practice at least 2Hours";
	}

	@Override
	public String getDailyFortune() {

		return fortuneservice.getFortunre()+" "+st;
	}
@PostConstruct
public void doStarting() {
	System.out.println("iniliting the bean");
}
@PreDestroy
public void doDestroy() {
	System.out.println("destroying bean");
}
}
