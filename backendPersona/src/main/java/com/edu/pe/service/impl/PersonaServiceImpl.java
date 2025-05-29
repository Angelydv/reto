package com.edu.pe.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.edu.pe.model.Persona;
import com.edu.pe.repository.IPersonaRepository;
import com.edu.pe.service.IPersonaService;

@Service
public class PersonaServiceImpl implements IPersonaService {
	
	@Autowired
	private IPersonaRepository personaRepository;
	 
	@Override
	public List<Persona> listar() {
		return personaRepository.findAll();
	}

}
