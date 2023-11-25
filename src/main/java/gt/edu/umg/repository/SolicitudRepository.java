package gt.edu.umg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import gt.edu.umg.entity.Solicitud;

public interface SolicitudRepository extends JpaRepository<Solicitud, Integer> {
    // Puedes agregar consultas personalizadas si es necesario
}