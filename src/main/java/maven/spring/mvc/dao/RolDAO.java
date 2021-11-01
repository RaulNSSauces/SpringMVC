package maven.spring.mvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.transaction.annotation.Transactional;

import maven.spring.mvc.model.Rol;
import maven.spring.mvc.utils.HibernateUtil;

public class RolDAO {
	
	//Este es el que llamo desde el JSP
	@Transactional
	public static List<Rol> getRoles(){
		Session miSesion = HibernateUtil.getSessionFactory().openSession();
		
		List<Rol> listadoDeRoles = RolDAO.listadoDeRoles(miSesion);
		return listadoDeRoles;
	}
	
	@Transactional
	public static List<Rol> listadoDeRoles(Session miSesion){
		Query<Rol> consulta = miSesion.createQuery("from Rol",Rol.class);
		
		List<Rol> listaRoles = consulta.getResultList();
		
		return listaRoles;
	}
	
	@Transactional
	public static boolean insertarRol(Session miSesion, String nombre) {
		boolean insertado = false;
		Transaction tx = miSesion.beginTransaction();
		try {
			Rol nuevoRol = new Rol (nombre);
			miSesion.save(nuevoRol);
			tx.commit();
			insertado = true;
		}catch(Exception e) {
			tx.rollback();
		}
		miSesion.close();
		return insertado;
	}
}