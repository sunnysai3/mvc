package com.cg;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="user")
public class UserController {
	@RequestMapping(value="showLogin")
	public String prepareLogin(Model model)
	{
		model.addAttribute("login",new Login());
		return "login";
	}
	@RequestMapping(value="checklogin")
	public ModelAndView checklogin(@ModelAttribute("login")Login login)
	{
		String username="sai";
		String password="123";
		return new ModelAndView("loginsuccess","username",login.getUserName());
	}
	@RequestMapping(value="showRegister")
	public String prepareRegister(Model model)
	{
		model.addAttribute("register",new User());
		return "register";
	}
	@RequestMapping(value="checkRegister")
	public String checkRegister(User user,Model model)
	{
		model.addAttribute("user",user);
		return "registerSuccess";
	}
	

	}


