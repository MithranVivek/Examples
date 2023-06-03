package com.examples.htmlConnect;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HtmlTaskController {

	@GetMapping(value = "/code")
	public ModelAndView save() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("demo");
		return modelAndView;
	}

}
