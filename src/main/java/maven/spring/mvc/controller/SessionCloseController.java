package maven.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SessionCloseController {
	
	@RequestMapping("/CloseSession")
	public String cerrarSesion(HttpServletRequest request) {
		String view = "";
		
		HttpSession session = request.getSession(false);
		
		if (session != null) {
			session.invalidate();
			view = "vLogin";
		}
		return view;
	}
}
