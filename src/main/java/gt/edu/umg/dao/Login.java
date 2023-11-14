package gt.edu.umg.dao;

import gt.edu.umg.entity.usuariosLogin;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Login extends JpaRepository<usuariosLogin,Long> {
    usuariosLogin findByCorreo(String correo, String contrasenia);

}
