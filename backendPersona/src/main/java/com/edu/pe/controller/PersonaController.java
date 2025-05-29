package com.edu.pe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.pe.model.Persona;
import com.edu.pe.service.IPersonaService;

@RestController
@RequestMapping("/api/personas")
@CrossOrigin
public class PersonaController {
	@Autowired
	private IPersonaService personaService;

	@GetMapping
	public List<Persona> listar() {
		return personaService.listar();
	}

}
