package gt.edu.umg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import gt.edu.umg.entity.Empleado;
import gt.edu.umg.repository.EmpleadoRepository;
@Service
public class EmpleadoService {

    @Autowired
    private final EmpleadoRepository empleadoRepository ;
    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    public List<Empleado> getAllEmpleados() {
        return empleadoRepository.findAll();
    }

    public Empleado getEmpleadoById(int id) {
        return empleadoRepository.findById(id).orElse(null);
    }

    public Empleado createEmpleado(Empleado empleado) {
        // Aquí puedes agregar lógica de negocio antes de guardar en la base de datos
        return empleadoRepository.save(empleado);
    }

    public Empleado updateEmpleado(int id, Empleado empleado) {
        if (empleadoRepository.existsById(id)) {
            empleado.setId(id);

            // Aquí puedes agregar lógica de negocio antes de actualizar en la base de datos
            return empleadoRepository.save(empleado);
        } else {
            return null; // Manejar la lógica de error según sea necesario
        }
    }

    public void deleteEmpleado(int id) {
        // Aquí puedes agregar lógica de negocio antes de eliminar de la base de datos
        empleadoRepository.deleteById(id);
    }
}