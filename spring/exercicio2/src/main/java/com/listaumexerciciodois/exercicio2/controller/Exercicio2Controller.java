package com.listaumexerciciodois.exercicio2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Exercicio2Controller {
	@GetMapping
	public String objetivos() {
		return "Meus objetivos de aprendizagem essa semana são entender o básico de Spring e revisar POO.";
	}
}
