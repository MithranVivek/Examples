package com.examples.ProfileTest;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("win")
@Primary
public class WindowsSystem implements OperatingSystem {

	@Override
	public String operatinSystem() {
		return "Windows Operating System";
	}

}
