package gt.edu.umg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gt.edu.umg.entity.Usuario;
import gt.edu.umg.services.AuthService;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {
	  @Autowired
	    private AuthService usuarioService;
	     @GetMapping
	    public List<Usuario> obtenerTodosUsuarios() {
	        return usuarioService.obtenerTodosUsuarios();
	    }

	    @GetMapping("/{id}")
	    public Usuario obtenerUsuarioPorId(@PathVariable int id) {
	        return usuarioService.obtenerUsuarioPorId(id);
	    }

	    @PostMapping
	    public Usuario crearUsuario(@RequestBody Usuario usuario) {
	        return usuarioService.crearUsuario(usuario);
	    }

	    @PutMapping("/{id}")
	    public Usuario actualizarUsuario(@PathVariable int id, @RequestBody Usuario usuario) {
	        return usuarioService.actualizarUsuario(id, usuario);
	    }

	    @DeleteMapping("/{id}")
	    public void eliminarUsuario(@PathVariable int id) {
	        usuarioService.eliminarUsuario(id);
	    }
	  
}
