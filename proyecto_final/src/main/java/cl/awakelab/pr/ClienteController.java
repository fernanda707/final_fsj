package cl.awakelab.pr;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping(value="/guardarNuevoCliente", method=RequestMethod.POST)
	public ModelAndView guardarNuevoCliente(HttpServletRequest request) {
		Cliente c=new Cliente();
		Comuna com=new Comuna();
		com.setId_comuna(Integer.parseInt(request.getParameter("slcComuna")));
		
		c.setRazon_social(request.getParameter("txtRazonSocial"));
		c.setRut(request.getParameter("txtRut"));
		c.setRubro(request.getParameter("txtRubro"));
		c.setDireccion(request.getParameter("txtDireccion"));
		c.setNum_colaboradores(Integer.parseInt(request.getParameter("txtNum")));
		c.setComuna(com);
		cls.add(c);
		
		return new ModelAndView("redirect:/listarClientes");
		
	}
	
	@RequestMapping(value="/eliminarCliente/{id}", method=RequestMethod.GET)
	public ModelAndView eliminarCliente(@PathVariable int id) {
		cls.deleteById(id);
		return new ModelAndView("redirect:/listarClientes");
		
	}
	
	@RequestMapping(value="/mostrarCliente/{id}", method=RequestMethod.GET)
	public ModelAndView mostrarCliente(@PathVariable int id, Model model) {
		Cliente c = cls.getById(id);
		List<Comuna> lista = cs.getAll();
		
		model.addAttribute("lista", lista);
		//model.addAttribute("cliente", c);
		return new ModelAndView("editarCliente", "cliente", c);
		
	}
	
	@RequestMapping(value="/guardarCliente", method = RequestMethod.POST)
	public ModelAndView guardarCliente(Cliente c, Comuna com) {
		c.setComuna(com);
		cls.edit(c);
		return new ModelAndView("redirect:/listarClientes");
	}
	
}
