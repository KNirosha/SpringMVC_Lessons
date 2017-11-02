package org.kms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PathVariablesController {
	
	@RequestMapping("/printPathVariables/{username}/{password}")
	public ModelAndView printPathvars(@PathVariable("username") String username, @PathVariable("password") String password){
		
		ModelAndView model= new ModelAndView("Pathvar");
		model.addObject("UN", username);
		model.addObject("PW",password);
		return model;
	}

}
