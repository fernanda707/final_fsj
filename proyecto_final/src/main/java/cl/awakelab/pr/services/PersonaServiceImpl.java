package cl.awakelab.pr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.pr.model.Cliente;
import cl.awakelab.pr.model.Persona;
import cl.awakelab.pr.model.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaService {
	
	@Autowired
	PersonaRepository pr;
	
	@Override
	public Persona getById(int id) {
		// TODO Auto-generated method stub
		return pr.findOne(id);
	}

	@Override
	public List<Persona> getAll() {
		// TODO Auto-generated method stub
		return (List<Persona>) pr.findAll();
	}

	@Override
	public void add(Persona p) {
		// TODO Auto-generated method stub
		pr.save(p);
	}

	@Override
	public void edit(Persona p) {
		// TODO Auto-generated method stub
		pr.save(p);
	}

	@Override
	public void delete(Persona p) {
		// TODO Auto-generated method stub
		pr.delete(p);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		pr.delete(id);
	}

}
