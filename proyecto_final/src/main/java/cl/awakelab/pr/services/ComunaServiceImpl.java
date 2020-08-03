package cl.awakelab.pr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.pr.model.Comuna;
import cl.awakelab.pr.model.ComunaRepository;

@Service
public class ComunaServiceImpl implements ComunaService {

	@Autowired
	ComunaRepository cr;
	
	@Override
	public Comuna getById(int id) {
		// TODO Auto-generated method stub
		return cr.findOne(id);
	}

	@Override
	public List<Comuna> getAll() {
		// TODO Auto-generated method stub
		return (List<Comuna>) cr.findAll();
	}

	@Override
	public void add(Comuna c) {
		// TODO Auto-generated method stub
		cr.save(c);
	}

	@Override
	public void edit(Comuna c) {
		// TODO Auto-generated method stub
		cr.save(c);
	}

	@Override
	public void delete(Comuna c) {
		// TODO Auto-generated method stub
		cr.delete(c);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		cr.delete(id);
	}

}
