package com.examples.paramExample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
public class ParamTest {
	
//	http://localhost:8081/get?name=vivek
	
	@GetMapping(value = "/get")
	public String getName(@RequestParam("name") String name) {
		return name;
	}

//	http://localhost:8081/getpath?name=vivek
	
	@GetMapping(value = "/getpath")
	public String getByName(@PathParam("name") String name) {
		return name;
	}
	
}
