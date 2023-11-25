package gt.edu.umg.repository;

import gt.edu.umg.entity.SolicitudDetalle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SolicitudDetalleRepository extends JpaRepository<SolicitudDetalle, Integer> {
    // Puedes agregar consultas personalizadas si es necesario
}