package gt.edu.umg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gt.edu.umg.entity.Muestra;
import gt.edu.umg.repository.MuestraRepository;


@Service
public class MuestraService {
	
	@Autowired
	private final MuestraRepository muestraRepository;

    
    public MuestraService(MuestraRepository muestraRepository) {
        this.muestraRepository = muestraRepository;
    }

    public List<Muestra> getAllMuestras() {
        return muestraRepository.findAll();
    }

    public Muestra getMuestraById(int id) {
        return muestraRepository.findById(id).orElse(null);
    }

    public Muestra createMuestra(Muestra muestra) {
        // Aquí puedes agregar lógica de negocio antes de guardar en la base de datos
        return muestraRepository.save(muestra);
    }

    public Muestra updateMuestra(int id, Muestra muestra) {
        if (muestraRepository.existsById(id)) {
            muestra.setId(id);
            
            // Aquí puedes agregar lógica de negocio antes de actualizar en la base de datos
            return muestraRepository.save(muestra);
        } else {
            return null; // Manejar la lógica de error según sea necesario
        }
    }

    public void deleteMuestra(int id) {
        // Aquí puedes agregar lógica de negocio antes de eliminar de la base de datos
        muestraRepository.deleteById(id);
    }
}
