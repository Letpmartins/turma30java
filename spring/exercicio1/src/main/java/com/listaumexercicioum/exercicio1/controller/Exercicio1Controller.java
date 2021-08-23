package com.listaumexercicioum.exercicio1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercicio1Controller {
	
	@GetMapping("/")
	public String habilidadeEMentalidade() {
		return "Para fazer esse exercício, eu usei de presistência e orientação ao detalhe.";
	}
	
}
