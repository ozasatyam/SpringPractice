package com.springDemo.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.springDemo.annotation")
public class SpringConfig {
@Bean
public FortuneService sadFortuneService() {
	return new SadFortuneService();
}
@Bean
public Coach swimCoach() {
	return new SwimCoach(sadFortuneService());
}
}
