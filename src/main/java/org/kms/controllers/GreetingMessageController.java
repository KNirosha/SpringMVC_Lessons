package org.kms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/*CONTROLLER FOR GREETING MESSAGES*/
@Controller
public class GreetingMessageController {

	@RequestMapping("/getGreetingMessage")
	public ModelAndView getGreetingMessage(){
		String greeting="Welcome to Lesson:2  Now You are able to write greetings in view";
		ModelAndView model = new ModelAndView("Greeting");
		model.addObject("greeting", greeting);
		model.addObject("greeting2", "HelloWorld");
		return model;
	}
	
	
	@RequestMapping("/getGreetingMessage1")
	public ModelAndView getGreetingMessage1(){
		String greeting="Welcome to Lesson:2  Now You are able to write greetings in view222";
		ModelAndView model = new ModelAndView("Greeting");
		model.addObject("greeting", greeting);
		return model;
	}
}
