package com.cg;


import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class MyController 
{
@RequestMapping("/hello")
 public ModelAndView demo()
 {
	 String today=new Date().toString();
	 return new ModelAndView("hello","today",today);
 }
public ModelAndView demo1(){
	String today=new Date().toString();
	return new ModelAndView("login");
}
}
