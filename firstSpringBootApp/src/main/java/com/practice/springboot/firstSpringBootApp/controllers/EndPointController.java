package com.practice.springboot.firstSpringBootApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EndPointController {

	@GetMapping("/html-interview-questions-and-answers")
	public String indexPage() {
		return "html-interview-questions";
	}

}
