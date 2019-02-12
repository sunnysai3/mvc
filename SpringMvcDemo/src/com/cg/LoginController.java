package com.cg;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class LoginController 
{
@RequestMapping("/hello1")
public ModelAndView demo()
{
	
	String username="sai";
	
	return new ModelAndView("success","user",username);
}

@RequestMapping(value="/showpage",method=RequestMethod.GET)
public String demo2(Model model)
{
	String username="sai";
	model.addAttribute("usrname",username);
	return "success";
}
@RequestMapping("/servlet1")
public String demo3 (@RequestParam("name")String username,@RequestParam("pass")String password,Model m)
{
	m.addAttribute("uname",username);
	return "success";
}

}
