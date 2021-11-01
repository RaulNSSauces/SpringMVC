package maven.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import maven.spring.mvc.dao.UsuarioDAO;

@Controller
public class LoginController {
	
	//Método para mapear la ruta y acceder por defecto al Login al arrancar la app
	@RequestMapping
	public String defaultAccess() {
		return controlDeAceso();
	}
	
	@RequestMapping("/menuLogin")
	public String controlDeAceso() {
		return "vLogin";
	}
	
	//Hacer login en la app
	@RequestMapping("/controlAcceso")
	public String processLogin(@RequestParam("user") String nombre, @RequestParam("passwd") String passwd, Model model) {
		String view = "";
		
		if(UsuarioDAO.getUsuarioEmail(nombre, passwd)) {
			view = "vInicio";
		}
		
		return view;
	}
}