package gt.edu.umg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gt.edu.umg.entity.EstadoSolicitud;

public interface EstadoSolicitudRepository extends JpaRepository<EstadoSolicitud, Integer> {
    // Puedes agregar consultas personalizadas si es necesario
}