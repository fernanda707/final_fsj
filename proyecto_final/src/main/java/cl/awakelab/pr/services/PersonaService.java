package cl.awakelab.pr.services;

import java.util.List;

import cl.awakelab.pr.model.Persona;


public interface PersonaService {
	Persona getById(int id);
	List<Persona> getAll();
	void add(Persona p);
	void edit(Persona p);
	void delete(Persona p);
	void deleteById(int id);
}
