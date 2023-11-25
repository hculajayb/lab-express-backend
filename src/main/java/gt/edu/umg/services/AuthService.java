package gt.edu.umg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gt.edu.umg.entity.Usuario;
import gt.edu.umg.repository.UsuarioRepository;

@Service
public class AuthService {

	@Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario autenticarUsuario(String correo, String contrasenia) {
        return usuarioRepository.findByCorreoAndContrasenia(correo, contrasenia);
    }

    
    public List<Usuario> obtenerTodosUsuarios() {
        return usuarioRepository.findAll();
    }

    public Usuario obtenerUsuarioPorId(int id) {
        return usuarioRepository.findById(id).orElse(null);
    }


    public Usuario crearUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }


    public Usuario actualizarUsuario(int id, Usuario usuario) {
        if (usuarioRepository.existsById(id)) {
            usuario.setId(id);
            return usuarioRepository.save(usuario);
        }
        return null; 
    }

    public void eliminarUsuario(int id) {
        usuarioRepository.deleteById(id);
    }
    
}
