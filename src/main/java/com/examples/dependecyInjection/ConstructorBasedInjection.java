package com.examples.dependecyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConstructorBasedInjection {
	
	private Injection inject;
	
	@Autowired
	public ConstructorBasedInjection(Injection inject) {  //constructor
		this.inject = inject;
	}
	
	@PostMapping(value ="/post")
	public String post(@RequestBody Injection inj) {
		new ConstructorBasedInjection(inj);
		return "injected";
	}
	

}
