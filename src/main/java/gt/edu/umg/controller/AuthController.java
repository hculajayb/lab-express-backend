package gt.edu.umg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import gt.edu.umg.entity.LoginRequest;
import gt.edu.umg.entity.Usuario;
import gt.edu.umg.services.AuthService;

@RestController
@RequestMapping("login")
@CrossOrigin(origins = "*")
public class AuthController {

	  @Autowired
	    private AuthService authService;
	  
	    @PostMapping
	    public Usuario login(@RequestBody LoginRequest loginRequest) {
	    	String correo = loginRequest.getCorreo();
	        String contrasenia = loginRequest.getContrasenia();
	        return authService.autenticarUsuario(correo, contrasenia);
	       
	    }
}
