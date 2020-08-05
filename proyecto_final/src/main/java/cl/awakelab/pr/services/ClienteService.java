package cl.awakelab.pr.services;

import java.util.List;

import cl.awakelab.pr.model.Cliente;

public interface ClienteService {
	Cliente getById(int id);
	List<Cliente> getAll();
	void add(Cliente c);
	void edit(Cliente c);
	void delete(Cliente c);
	void deleteById(int id);
}
