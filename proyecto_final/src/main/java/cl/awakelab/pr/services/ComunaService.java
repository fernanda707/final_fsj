package cl.awakelab.pr.services;

import java.util.List;

import cl.awakelab.pr.model.Comuna;

public interface ComunaService {
	Comuna getById(int id);
	List<Comuna> getAll();
	void add(Comuna c);
	void edit(Comuna c);
	void delete(Comuna c);
	void deleteById(int id);
}
