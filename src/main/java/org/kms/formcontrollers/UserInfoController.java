package org.kms.formcontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserInfoController {
	
	@RequestMapping("/UserInfo")
	public String userInfoPage(){
		return "UserInfo";
	}

}
