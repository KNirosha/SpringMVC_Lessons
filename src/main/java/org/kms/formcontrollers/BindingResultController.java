package org.kms.formcontrollers;

import org.kms.model.beans.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BindingResultController {

	@RequestMapping("/bindingResultHandler")
	public ModelAndView bindingResultHandler(@ModelAttribute("userinfo") UserInfo info, BindingResult result){
		System.out.println(result.getAllErrors().toString());
		if(!result.hasErrors())
		{
			return new ModelAndView("bindingresultDemo");
		}else{
			return new ModelAndView("UserInfo");
		}
	}
}
