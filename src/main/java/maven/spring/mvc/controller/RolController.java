package maven.spring.mvc.controller;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import maven.spring.mvc.dao.RolDAO;
import maven.spring.mvc.utils.HibernateUtil;

@Controller
public class RolController {
	
	@RequestMapping("vAltaRol")
	public String vistaAltaRol() {
		return "vAltaRol";
	}
	
	@RequestMapping("vMostrarListado")
	public String mostrarListadoRoles() {
		return "vMostrarListado";
	}
	
	@RequestMapping("/AltaRol")
	public String insertarRol(@RequestParam("nombreRol") String nombreRol, Model model) {
		String view = "";
		
		Session miSesion = HibernateUtil.getSessionFactory().openSession();
		if(RolDAO.insertarRol(miSesion, nombreRol)) {
			view = "vMostrarListado";
		}else {
			view = "vAltaRol";
		}
		return view;
	}
}