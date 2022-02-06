package com.example.eCommerce.signUp;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class SignupController {
	
	@PostMapping("/mobileNo")
	public String sendOpt(@RequestBody SignUp sms ) {
		
		try {
			System.out.println(sms.getPhoneNo());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "SuccessFully OPT send to your mobile number ";
		
	}

}
