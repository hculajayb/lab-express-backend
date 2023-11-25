package gt.edu.umg.repository;

import gt.edu.umg.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {
    // Puedes agregar consultas personalizadas si es necesario
}