package com.machinsoftware.springboot.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class EjemploParamsController {
	
	
	@GetMapping("/")
	public String index() {
		return "params/index";
	}

	@GetMapping("/string")
	public String param(@RequestParam(required = false, defaultValue = "valor pro default") String texto, Model model) {
		
		model.addAttribute("resultado", "el parametro enviado es " + texto);
		
		
		return "params/ver";
	}
	
}
