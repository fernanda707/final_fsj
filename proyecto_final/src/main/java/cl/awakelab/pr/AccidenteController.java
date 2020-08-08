package cl.awakelab.pr;

import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.awakelab.pr.model.Accidente;
import cl.awakelab.pr.model.Cliente;
import cl.awakelab.pr.model.Persona;
import cl.awakelab.pr.model.Usuario;
import cl.awakelab.pr.services.AccidenteService;
import cl.awakelab.pr.services.PersonaService;
import cl.awakelab.pr.services.UsuarioService;

@Controller
public class AccidenteController {

	@Autowired
	AccidenteService as;
	@Autowired
	UsuarioService us;
	@Autowired
	PersonaService ps;
	
	@RequestMapping(value="/listaAccidentes", method=RequestMethod.GET)
	public ModelAndView lista() {
		List<Accidente> lista = as.getAll();
		for (Accidente accidente : lista) {
			System.out.println(accidente.getId_accidente());
		}
		
		return new ModelAndView("listAccidentes", "lista", lista);
		
	}
	
	@RequestMapping(value="/nuevoAccidente", method=RequestMethod.GET)
	public ModelAndView nuevoAccidente() {
		Cliente c=new Cliente();
		List<Usuario> lista = us.getAll();
		String user=SecurityContextHolder.getContext().getAuthentication().getName();
		for (Usuario usuario : lista) {
			if(usuario.getUsername().equals(user)) {
				System.out.println(usuario.getCliente().getId_cliente());
				c.setId_cliente(usuario.getCliente().getId_cliente());
			}
		}
		return new ModelAndView("addAccidente", "c", c);
		
	}
	
	@RequestMapping(value="/guardarAccidente", method=RequestMethod.POST)
	public ModelAndView guardar(HttpServletRequest request) {
		Persona p=new Persona();
		p.setRut(request.getParameter("rut"));
		p.setNombre(request.getParameter("nombre"));
		p.setAp_paterno(request.getParameter("ap_paterno"));
		p.setAp_materno(request.getParameter("ap_materno"));
		p.setEdad(Integer.parseInt(request.getParameter("edad")));
		p.setEs_profesional(request.getParameter("es_profesional").charAt(0));
		
		Cliente c=new Cliente();
		c.setId_cliente(Integer.parseInt(request.getParameter("id_cliente")));
		
		ps.add(p);
		if(p.getId_persona()!=0) {
			Accidente a=new Accidente();
			a.setCliente(c);
			a.setPersona(p);
			a.setFecha_accidente(Date.valueOf(request.getParameter("fecha_accidente")));
			a.setLabor_desarrollada(request.getParameter("labor_desarrollada"));
		}
		
		
		
		
		return new ModelAndView("redirect:/listaAccidentes");
		
	}
}
