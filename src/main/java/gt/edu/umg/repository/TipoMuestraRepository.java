package gt.edu.umg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gt.edu.umg.entity.TipoMuestra;

public interface TipoMuestraRepository extends JpaRepository<TipoMuestra, Integer> {
    // Puedes agregar consultas personalizadas si es necesario
}