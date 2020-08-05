package cl.awakelab.pr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.awakelab.pr.model.Cliente;
import cl.awakelab.pr.model.Comuna;
import cl.awakelab.pr.services.ClienteService;
import cl.awakelab.pr.services.ComunaService;


@Controller
public class ClienteController {
	
	@Autowired
	ComunaService cs;
	@Autowired
	ClienteService cls;
	
	@RequestMapping(value="/administracion", method=RequestMethod.POST)
	public ModelAndView administracion() {
		
    	System.out.println(SecurityContextHolder.getContext().getAuthentication().getName());

		return new ModelAndView("administracion");
		
	}
	
	@RequestMapping(value="/listarClientes", method=RequestMethod.GET)
	public ModelAndView listarEmpleados() {
		
		List<Cliente> lista = cls.getAll();
		return new ModelAndView("listaClientes", "lista", lista);
		
	}
	
	@RequestMapping(value="/nuevoCliente", method=RequestMethod.GET)
	public ModelAndView agregarCliente() {
		
		List<Comuna> lista = cs.getAll();
		return new ModelAndView("nuevoCliente", "lista", lista);
		
	}
}
