package org.kms.formcontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginFormController {

	@RequestMapping("/LoginAction")
	public String  loginAction(@RequestParam("username") String un, @RequestParam("password") String pwd, Model model){
		model.addAttribute("UN", un);
		model.addAttribute("PWD",pwd);
		if(un.equalsIgnoreCase("ricky")&& pwd.equalsIgnoreCase("ponting")){
			
			return "loginsuccess";
		}else{
			model.addAttribute("ERROR_MESSAGE", "Invalid credentials. Please try login again!!!");
			return "login";

		}
	}
	
}
