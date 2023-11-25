package gt.edu.umg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gt.edu.umg.entity.TipoMuestra;
import gt.edu.umg.repository.TipoMuestraRepository;

@Service
public class TipoMuestraService {
	 @Autowired
    private final TipoMuestraRepository tipoMuestraRepository;

   
    public TipoMuestraService(TipoMuestraRepository tipoMuestraRepository) {
        this.tipoMuestraRepository = tipoMuestraRepository;
    }

    public List<TipoMuestra> getAllTiposMuestra() {
        return tipoMuestraRepository.findAll();
    }

    public TipoMuestra getTipoMuestraById(int id) {
        return tipoMuestraRepository.findById(id).orElse(null);
    }

    public TipoMuestra createTipoMuestra(TipoMuestra tipoMuestra) {
        // Aquí puedes agregar lógica de negocio antes de guardar en la base de datos
        return tipoMuestraRepository.save(tipoMuestra);
    }

    public TipoMuestra updateTipoMuestra(int id, TipoMuestra tipoMuestra) {
        if (tipoMuestraRepository.existsById(id)) {
            tipoMuestra.setId(id);
            // Aquí puedes agregar lógica de negocio antes de actualizar en la base de datos
            return tipoMuestraRepository.save(tipoMuestra);
        } else {
            return null; // Manejar la lógica de error según sea necesario
        }
    }

    public void deleteTipoMuestra(int id) {
        // Aquí puedes agregar lógica de negocio antes de eliminar de la base de datos
        tipoMuestraRepository.deleteById(id);
    }
}