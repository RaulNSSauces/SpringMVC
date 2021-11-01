package maven.spring.mvc.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import maven.spring.mvc.model.Usuario;
import maven.spring.mvc.utils.HibernateUtil;

@Repository
public class UsuarioDAO {
	
	@Transactional
	public static boolean getUsuarioEmail(String email, String passwd) {
		
		Session miSesion = HibernateUtil.getSessionFactory().openSession();
		
		boolean existe = false;

		List<Usuario> listaUsuario = miSesion.createQuery("from Usuario", Usuario.class).getResultList();
		
		for (Usuario usuario : listaUsuario) {
			if(usuario.getEmail().equals(email) && usuario.getClave().equals(passwd)) {
				existe = true;
			}
		}
		miSesion.close();
		return existe;
	}
	
	@Transactional
	public static Usuario getUsuarios(String email, String passwd) {
		
		Session miSesion = HibernateUtil.getSessionFactory().openSession();

		List<Usuario> listaUsuario = miSesion.createQuery("from Usuario", Usuario.class).getResultList();
		
		Usuario u = listaUsuario.get(0);
		miSesion.close();
		
		return u;
	}
	
	@Transactional
	public static boolean insertarUsuario(Session miSesion, int idRol, String email, String clave, String nombre, String apellido1, String apellido2, String direccion, String localidad, String provincia, String telefono, String dni) {
		boolean insertado = false;
		Transaction tx = miSesion.beginTransaction();
		try {
			Usuario nuevoUsuario = new Usuario (idRol, email, clave, nombre, apellido1, apellido2, direccion, localidad, provincia, telefono, dni);
			miSesion.save(nuevoUsuario);
			tx.commit();
			insertado = true;
		}catch(Exception e) {
			tx.rollback();
			System.out.println("No se ha podido insertar el usuario" + e);
		}
		miSesion.close();
		return insertado;
	}
}