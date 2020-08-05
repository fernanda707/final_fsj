package cl.awakelab.pr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.pr.model.Cliente;
import cl.awakelab.pr.model.ClienteRepository;
import cl.awakelab.pr.model.Comuna;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	ClienteRepository cr;
	
	@Override
	public Cliente getById(int id) {
		// TODO Auto-generated method stub
		return cr.findOne(id);
	}

	@Override
	public List<Cliente> getAll() {
		// TODO Auto-generated method stub
		return (List<Cliente>) cr.findAll();
	}

	@Override
	public void add(Cliente c) {
		// TODO Auto-generated method stub
		cr.save(c);
	}

	@Override
	public void edit(Cliente c) {
		// TODO Auto-generated method stub
		cr.save(c);
	}

	@Override
	public void delete(Cliente c) {
		// TODO Auto-generated method stub
		cr.delete(c);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		cr.delete(id);
	}

}
