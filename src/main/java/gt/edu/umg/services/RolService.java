package gt.edu.umg.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import gt.edu.umg.entity.Rol;
import gt.edu.umg.repository.RolRepository;


@Service
public class RolService {

    @Autowired
    private final RolRepository rolRepository;


    public RolService(RolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }

    public List<Rol> getAllRol() {
        return rolRepository.findAll();
    }

    public Rol getRolById(int id) {
        return rolRepository.findById(id).orElse(null);
    }

    public Rol createRol(Rol rol) {
        // Aquí puedes agregar lógica de negocio antes de guardar en la base de datos
        return rolRepository.save(rol);
    }

    public Rol updateRol(int id, Rol rol) {
        if (rolRepository.existsById(id)) {
            rol.setId(id);

            // Aquí puedes agregar lógica de negocio antes de actualizar en la base de datos
            return rolRepository.save(rol);
        } else {
            return null; // Manejar la lógica de error según sea necesario
        }
    }

    public void deleteRol(int id) {
        // Aquí puedes agregar lógica de negocio antes de eliminar de la base de datos
        rolRepository.deleteById(id);
    }
}