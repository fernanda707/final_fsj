package cl.awakelab.pr;

import java.text.DateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		//System.out.println(SecurityContextHolder.getContext().getAuthentication().getAuthorities());
		List<GrantedAuthority> authorities = (List<GrantedAuthority>)
				  SecurityContextHolder.getContext().getAuthentication().getAuthorities();
		//System.out.println(authorities.get(0).getAuthority());
		if(authorities.get(0).getAuthority().equals("ADMIN")) {
			return new ModelAndView("administracion");
		}
		if(authorities.get(0).getAuthority().equals("CLIENTE")) {
			return new ModelAndView("cliente" );
		}else {
			return new ModelAndView("profesional");
		}
		
	}
	
	@RequestMapping("/login")
	public String login() {		
		return "home";
	}
	
	@RequestMapping("/error")
    public String error(ModelMap model)
    {
        model.addAttribute("error", "true");
        return "home";
    }
	
	@RequestMapping("/logout")
	public String logout(){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    if (auth != null){    
	    	SecurityContextHolder.getContext().setAuthentication(null);
	    }
	        return "redirect:/login";
	}
}
