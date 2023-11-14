package gt.edu.umg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class loginService {
    @Autowired
    private gt.edu.umg.dao.Login _login;

    public gt.edu.umg.entity.usuariosLogin findByCorreo(String correo, String contrasenia){
        return _login.findByCorreo(correo, contrasenia);
    }
}
