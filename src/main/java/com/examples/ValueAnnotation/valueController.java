package com.examples.ValueAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/value")
public class valueController {

	@Value("${configure.property.name}")
	public String word1;
	
	@Value("Dr.")
	public String doc;

	@GetMapping(value = "/word")
	public String word(@RequestParam("name") String word) {
		return word + word1;
	}
	
	@GetMapping(value = "/param")
	public String param(@Value("${configure.property.name}") String name) {
		return name;
	}

}
