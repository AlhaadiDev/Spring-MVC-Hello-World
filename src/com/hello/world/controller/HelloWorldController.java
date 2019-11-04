package com.hello.world.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {  // this is our controller
	
	//handle method
	@RequestMapping(value="/", method= RequestMethod.GET )  //this is handler mapping 1
	public String sayHello(ModelMap model) {
		model.addAttribute("message", "Welcom from Spring MVC");
		return "welcome";  // this is logical name (view name) 
	}
	
	@RequestMapping(value="/helloAgain", method= RequestMethod.GET )   //this is handler mapping 2
	public String sayHelloAgain(ModelMap model) {
		model.addAttribute("message", "Welcom Again from Spring MVC");
		return "welcome";
	}
}
