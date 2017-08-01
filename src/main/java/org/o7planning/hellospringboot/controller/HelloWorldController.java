package org.o7planning.hellospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/hello")
	public String hello(Model model) {

		model.addAttribute("greeting", "Hello Spring Boot MVC");

		return "helloworld";

	}

}