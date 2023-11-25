package gt.edu.umg.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import gt.edu.umg.entity.Solicitud;
import gt.edu.umg.repository.SolicitudRepository;


@Service
public class SolicitudService {
	@Autowired
	 private final SolicitudRepository solicitudRepository;

	    public SolicitudService(SolicitudRepository solicitudRepository) {
	        this.solicitudRepository = solicitudRepository;
	    }

	    public List<Solicitud> getAllSolicitudes() {
	        return solicitudRepository.findAll();
	    }

	    public Solicitud getSolicitudById(int id) {
	        return solicitudRepository.findById(id).orElse(null);
	    }

	    public Solicitud createSolicitud(Solicitud solicitud) {
	        return solicitudRepository.save(solicitud);
	    }

	    public Solicitud updateSolicitud(int id, Solicitud solicitud) {
	        if (solicitudRepository.existsById(id)) {
	            
	            solicitud.setId(id);
	            // Aquí puedes agregar lógica de negocio antes de actualizar en la base de datos
	            return solicitudRepository.save(solicitud);
	        } else {
	            return null; // Manejar la lógica de error según sea necesario
	        }
	    }

	    public void deleteSolicitud(int id) {
	        // Aquí puedes agregar lógica de negocio antes de eliminar de la base de datos
	        solicitudRepository.deleteById(id);
	    }
}
