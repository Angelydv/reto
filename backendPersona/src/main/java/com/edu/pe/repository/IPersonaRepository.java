package com.edu.pe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.pe.model.Persona;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
}