package com.fplheist;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class Test {
  
	
@GetMapping("/signUp")
public String signUp(HttpServletRequest req) 
{
	String email = req.getParameter("email");
	String psw = req.getParameter("psw");
	
	System.out.print("signUpMethod is working" + email + "password is" + psw );
	return "index";
}

}
