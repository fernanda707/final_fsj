package cl.awakelab.pr.services;

import java.util.List;

import cl.awakelab.pr.model.Accidente;


public interface AccidenteService {
	Accidente getById(int id);
	List<Accidente> getAll();
	void add(Accidente c);
	void edit(Accidente c);
	void delete(Accidente c);
	void deleteById(int id);
}
