package org.kms.formcontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ModelAttributeMethodDemoController {

	@RequestMapping("/ModelAttributeMethodDemo")
	public ModelAndView modelAttributeMethodDemo(){
		ModelAndView view= new ModelAndView("modelDemo");
		view.addObject("MESSAGE", "HELLO WORLD!!!");
		return view;
	}
	
	@ModelAttribute
	public void addHeaderMessage(Model  model){
		model.addAttribute("HEADER", "THIS IS A HEADER MESSAGE!!!");
	}
}
