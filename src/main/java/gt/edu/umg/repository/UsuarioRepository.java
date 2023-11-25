package gt.edu.umg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gt.edu.umg.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Usuario findByCorreoAndContrasenia(String correo, String contrasenia);
}