package com.springDemo.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Coach coach = context.getBean("tennisCoach",Coach.class);
		System.out.println(coach.dailyWorkout());
		System.out.println(coach.getDailyFortune());
	}

}
