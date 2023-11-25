package gt.edu.umg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import gt.edu.umg.entity.Items;

public interface ItemsRepository extends JpaRepository<Items, Integer> {
    // Puedes agregar consultas personalizadas si es necesario
}