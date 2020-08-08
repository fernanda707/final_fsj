package cl.awakelab.pr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.pr.model.Accidente;
import cl.awakelab.pr.model.AccidenteRepository;

@Service
public class AccidenteServiceImpl implements AccidenteService {

	@Autowired
	AccidenteRepository ar;
	
	@Override
	public Accidente getById(int id) {
		// TODO Auto-generated method stub
		return ar.findOne(id);
	}

	@Override
	public List<Accidente> getAll() {
		// TODO Auto-generated method stub
		return (List<Accidente>) ar.findAll();
	}

	@Override
	public void add(Accidente c) {
		// TODO Auto-generated method stub
		ar.save(c);
	}

	@Override
	public void edit(Accidente c) {
		// TODO Auto-generated method stub
		ar.save(c);
	}

	@Override
	public void delete(Accidente c) {
		// TODO Auto-generated method stub
		ar.delete(c);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		ar.delete(id);
	}

}
