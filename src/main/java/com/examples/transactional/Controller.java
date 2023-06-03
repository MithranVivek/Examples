package com.examples.transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/trans")
@Transactional
public class Controller {

	@Autowired
	SenderRepo sr;

	@Autowired
	RecieverRepo rr;

	@PostMapping("/post")
	public String post(@RequestBody Objects obj) {
		sr.save(obj.getSender());
		int num = 10 / 0;
		rr.save(obj.getReciever());

		return "transaction successful";
	}
}
