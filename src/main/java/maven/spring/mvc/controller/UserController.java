package maven.spring.mvc.controller;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import maven.spring.mvc.dao.UsuarioDAO;
import maven.spring.mvc.utils.HibernateUtil;

@Controller
public class UserController {
	
	@RequestMapping("vAltaUsuario")
	public String altaUsuario() {
		return "vAltaUsuario";
	}
	
	@RequestMapping("/AltaUsuario")
	public String insertarUsuario(@RequestParam("idRol") int idRol, @RequestParam("email") String email, @RequestParam("clave") String clave, @RequestParam("nombre") String nombre, @RequestParam("ape1") String ape1, @RequestParam("ape2") String ape2, @RequestParam("direccion") String direccion, @RequestParam("localidad") String localidad, @RequestParam("provincia") String provincia, @RequestParam("telefono") String telefono, @RequestParam("dni") String dni, Model model) {
		String view = "";
		
		Session miSesion = HibernateUtil.getSessionFactory().openSession();
		if(UsuarioDAO.insertarUsuario(miSesion, idRol, email, clave, nombre, ape1, ape2, direccion, localidad, provincia, telefono, dni)) {
			view = "vInicio";
		}else {
			view = "vLogin";
		}
		return view;
	}
}
