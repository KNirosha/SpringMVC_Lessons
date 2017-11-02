package org.kms.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class PathVariablesMapController {
	@RequestMapping("/printPathMap/{name}/{technology}/{salary}")
	public ModelAndView printPathMap(@PathVariable Map<String , String> requestMap){
		ModelAndView model = new ModelAndView("Pathmap");
		model.addAllObjects(requestMap);
		return model;
	}

}
