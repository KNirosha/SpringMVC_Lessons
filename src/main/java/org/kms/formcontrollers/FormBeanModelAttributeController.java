package org.kms.formcontrollers;

import org.kms.model.beans.LoginBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormBeanModelAttributeController {

	
	@RequestMapping("/LoginActionModel")
	public String handleModelObjRequest(@ModelAttribute("loginBean") LoginBean loginBean, Model model ){
		
		
		if(loginBean.getUsername().equalsIgnoreCase("ricky")&& loginBean.getPassword().equalsIgnoreCase("ponting")){
			
			return "loginsuccess";
		}else{
			model.addAttribute("ERROR_MESSAGE", "Invalid credentials. Please try login again!!!");
			return "login1";

		}
	}
	
	}
