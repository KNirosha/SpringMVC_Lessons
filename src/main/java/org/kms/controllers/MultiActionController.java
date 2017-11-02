package org.kms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MultiActionController {
	
	@RequestMapping("/MultiAction1")
	public String multiaction1(Model model){
		model.addAttribute("Controller","Action1");
		model.addAttribute("Author","MUNISEKHAR");
		return "MultiAction";
	}
	
	@RequestMapping("/MultiAction2")
	public ModelAndView multiaction2(){
		ModelAndView model1= new ModelAndView("MultiAction");
		model1.addObject("Controller","Action2");
		model1.addObject("Author","MEDHANSH");
		return model1;
	}

}
