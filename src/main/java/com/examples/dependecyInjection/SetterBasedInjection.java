package com.examples.dependecyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SetterBasedInjection {

	private Injection inject;

	@Autowired
	public void setterBasedInjection(Injection inject) { //setter
		this.inject = inject;
	}

}
