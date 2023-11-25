package gt.edu.umg.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import gt.edu.umg.entity.Items;
import gt.edu.umg.repository.ItemsRepository;


@Service
public class ItemsService {

    @Autowired
    private final ItemsRepository itemsRepository;

    public ItemsService(ItemsRepository itemsRepository) {
        this.itemsRepository = itemsRepository;
    }

    public List<Items> getAllItems() {
        return itemsRepository.findAll();
    }

    public Items getItemById(int id) {
        return itemsRepository.findById(id).orElse(null);
    }

    public Items createItem(Items items) {
        // Aquí puedes agregar lógica de negocio antes de guardar en la base de datos
        return itemsRepository.save(items);
    }

    public Items updateItem(int id, Items items) {
        if (itemsRepository.existsById(id)) {
            items.setId(id);

            // Aquí puedes agregar lógica de negocio antes de actualizar en la base de datos
            return itemsRepository.save(items);
        } else {
            return null; // Manejar la lógica de error según sea necesario
        }
    }

    public void deleteItem(int id) {
        // Aquí puedes agregar lógica de negocio antes de eliminar de la base de datos
        itemsRepository.deleteById(id);
    }
}