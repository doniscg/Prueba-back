package com.coope.back;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface PersonaRepositorio extends Repository<Persona, Integer> {
	List<Persona>findAll();
	Persona findOne(int id);
	Persona save(Persona P);
	void delete(Persona p);
}
