package gt.edu.umg.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import gt.edu.umg.entity.EstadoSolicitud;
import gt.edu.umg.repository.EstadoSolicitudRepository;


@Service
public class EstadoSolicitudService {
    @Autowired
    private final EstadoSolicitudRepository estadoSolicitudRepository;

    public EstadoSolicitudService(EstadoSolicitudRepository estadoSolicitudRepository) {
        this.estadoSolicitudRepository = estadoSolicitudRepository;
    }

    public List<EstadoSolicitud> getAllEstadosSolicitudes() {
        return estadoSolicitudRepository.findAll();
    }

    public EstadoSolicitud getEstadoSolicitudById(int id) {
        return estadoSolicitudRepository.findById(id).orElse(null);
    }

    public EstadoSolicitud createEstadoSolicitud(EstadoSolicitud estadoSolicitud) {
        return estadoSolicitudRepository.save(estadoSolicitud);
    }

    public EstadoSolicitud updateEstadoSolicitud(int id, EstadoSolicitud estadoSolicitud) {
        if (estadoSolicitudRepository.existsById(id)) {

            estadoSolicitud.setId(id);
            // Aquí puedes agregar lógica de negocio antes de actualizar en la base de datos
            return estadoSolicitudRepository.save(estadoSolicitud);
        } else {
            return null; // Manejar la lógica de error según sea necesario
        }
    }

    public void deleteEstadoSolicitud(int id) {
        // Aquí puedes agregar lógica de negocio antes de eliminar de la base de datos
        estadoSolicitudRepository.deleteById(id);
    }
}