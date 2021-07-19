package com.springDemo.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Coach coach = context.getBean("tennisCoach",Coach.class);
		System.out.println(coach.dailyWorkout());
		System.out.println(coach.getDailyFortune());
	}

}
