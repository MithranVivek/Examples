package com.examples.ProfileTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile")
public class OperatingSystemController {
	
	@Autowired
	OperatingSystem ops;
	
	@GetMapping(value = "/system")
	public String getOperatingSystem() {
		return ops.operatinSystem();
	}

}
