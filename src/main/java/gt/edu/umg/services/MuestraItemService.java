package gt.edu.umg.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import gt.edu.umg.entity.MuestraItem;
import gt.edu.umg.repository.MuestraItemRepository;


@Service
public class MuestraItemService {

    @Autowired
    private final MuestraItemRepository muestraItemRepository;


    public MuestraItemService(MuestraItemRepository muestraItemRepository) {
        this.muestraItemRepository = muestraItemRepository;
    }

    public List<MuestraItem> getAllMuestrasItems() {
        return muestraItemRepository.findAll();
    }

    public MuestraItem getMuestraItemById(int id) {
        return muestraItemRepository.findById(id).orElse(null);
    }

    public MuestraItem createMuestraItem(MuestraItem muestraItem) {
        // Aquí puedes agregar lógica de negocio antes de guardar en la base de datos
        return muestraItemRepository.save(muestraItem);
    }

    public MuestraItem updateMuestraItem(int id, MuestraItem muestraItem) {
        if (muestraItemRepository.existsById(id)) {
            muestraItem.setId(id);

            // Aquí puedes agregar lógica de negocio antes de actualizar en la base de datos
            return muestraItemRepository.save(muestraItem);
        } else {
            return null; // Manejar la lógica de error según sea necesario
        }
    }

    public void deleteMuestraItem(int id) {
        // Aquí puedes agregar lógica de negocio antes de eliminar de la base de datos
        muestraItemRepository.deleteById(id);
    }
}