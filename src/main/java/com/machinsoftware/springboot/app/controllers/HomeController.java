package com.machinsoftware.springboot.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String Home() {
		return "redirect:/app/index";
	}

	
	@GetMapping("/vamos")
	public String vamos() {
		return "redirect:http://www.google.com";
	}
	
	@GetMapping("/hola")
	public String HomeDos() {
		//con el forward redireccionamos pero sin perder la peticion queya tenemos y todo los datos en ella
		//puede server para seguir con los datos de un formulairo o de una session
		return "forward:/app/index";
	}

}
