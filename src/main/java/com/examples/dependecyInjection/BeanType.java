package com.examples.dependecyInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanType {

	@Bean
	public Injection inj() {
		return new Injection();
	}
}
