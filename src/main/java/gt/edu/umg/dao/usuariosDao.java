package gt.edu.umg.dao;


import gt.edu.umg.entity.usuarios;

import java.util.List;
import java.util.Optional;

public interface usuariosDao {
    List<usuarios> findAll();
    Optional<usuarios> findById(Integer id);
    void save(usuarios body);
    void update(Integer id, usuarios body);
    void delete(Integer id);
}
