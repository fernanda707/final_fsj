package cl.awakelab.pr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.awakelab.pr.model.Persona;
import cl.awakelab.pr.services.PersonaService;

@Controller
public class ProfesionalController {

	@Autowired
	PersonaService ps;
	
	@RequestMapping(value="/listaProfesionales", method=RequestMethod.GET)
	public ModelAndView listaProfesionales() {
		
    	List<Persona> lista=ps.getAll();

		return new ModelAndView("listaProfesionales", "lista", lista);
		
	}
	///nuevoProfesional
	@RequestMapping(value="/nuevoProfesional", method=RequestMethod.GET)
	public ModelAndView nuevoProfesional() {

		return new ModelAndView("addProfesional");
		
	}
	
	@RequestMapping(value="/guardarProfesional", method=RequestMethod.POST)
	public ModelAndView guardarProfesional(Persona p) {
		p.setEs_profesional('1'); 
		ps.add(p);
		return new ModelAndView("redirect:/listaProfesionales");
		
	}
	
	///eliminarPersona
	@RequestMapping(value="/eliminarPersona/{id}", method=RequestMethod.GET)
	public ModelAndView eliminar(@PathVariable int id) {
		ps.deleteById(id);
		return new ModelAndView("redirect:/listaProfesionales");
		
	}
	
	@RequestMapping(value="/mostrarProfesional/{id}", method=RequestMethod.GET)
	public ModelAndView mostrar(@PathVariable int id) {
		Persona p=ps.getById(id);
		return new ModelAndView("editProfesional", "p", p);
		
	}
	
}
