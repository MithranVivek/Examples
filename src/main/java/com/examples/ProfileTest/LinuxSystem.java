package com.examples.ProfileTest;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("lin")
public class LinuxSystem implements OperatingSystem {

	@Override
	public String operatinSystem() {
		return "Linux Operating System";
	}

}
