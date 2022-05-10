package com.machinsoftware.springboot.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.machinsoftware.springboot.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {

	@GetMapping({"/index", "/", "/home"})
	public String index(Model model) {
		model.addAttribute("titulo", "Hola desde el controlador");
		return "index";
	}
	
	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Andres");
		usuario.setApellido("Guzman");
		usuario.setEmail("andresgusman@gmail.com");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Perfil de usuario ".concat(usuario.getNombre()));
		return "perfil";
	}
	
	@RequestMapping("/listar")
	public String listar(Model model) {
		
		model.addAttribute("titulo", "Listado de Usuarios");
		//Aqui podemo usar la variable usuarios que nos regresa el metodo poblar usuarios en la vista
		//model.addAttribute("usuarios", usuarios);
		return "listar";
	}
	
	//asi con este metodo todos lo metodos podran usuar la lista usuariso que devuelve
	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios(){
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Andres", "Guzman", "andres@gmial.com"));
		usuarios.add(new Usuario("Lenin", "Roman", "lenin@gmial.com"));
		usuarios.add(new Usuario("Emanuel", "landeros", "emanil@gmial.com"));
		usuarios.add(new Usuario("Tornado", "Roe", "tornado@gmial.com"));
		return usuarios;
	}
	
	
	
}
