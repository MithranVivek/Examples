package com.examples.dependecyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FiledBasedInjection {
	
	@Autowired
	Injection inject; //field

}
