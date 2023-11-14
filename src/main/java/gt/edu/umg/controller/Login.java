package gt.edu.umg.controller;

import gt.edu.umg.entity.usuariosLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class Login {

    @Autowired
    private Login _loginService;

    @PostMapping("/login")

    public String login(@RequestBody usuariosLogin loginRequest) {
        _loginService usuario = _loginService.(loginRequest.getCorreo(), loginRequest.getContrasenia());

        if (usuario != null) {
            return "Login exitoso";
        } else {
            return "Credenciales incorrectas";
        }
    }


}
