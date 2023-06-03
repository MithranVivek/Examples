package com.examples.responseEntity;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ResponseEntityTest {
	
	//controller we want the return value using ResponseBody annotation
	@RequestMapping(value = "/getResponse", method = RequestMethod.GET)
	@ResponseBody
	public String getControl() {
		return "Welcome to ResponseBody";
	}
	
	//without ResponseBody annotation we can get return value using this ->
	@RequestMapping(value = "/getEntity", method = RequestMethod.GET)
	public ResponseEntity<String> getName() {
		ResponseEntity<String> res = new ResponseEntity<>("Welcome to ResponseEntity",HttpStatus.ACCEPTED);
		return res;
	}

}
