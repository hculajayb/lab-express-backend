package gt.edu.umg.service;

import gt.edu.umg.dao.usuariosDao;
import gt.edu.umg.entity.usuarios;
import gt.edu.umg.repository.usuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class usuariosService implements usuariosDao {

    @Autowired
    private usuariosRepository _usuariosRepository;

    @Override
    public List<usuarios> findAll() {
        return _usuariosRepository.findAll();
    }

    @Override
    public Optional<usuarios> findById(Integer id) {
        return _usuariosRepository.findById(id);
    }

    @Override
    public void save(usuarios body) {
        _usuariosRepository.save(body);
    }

    @Override
    public void update(Integer id, usuarios body) {
        body.setId(id);
        _usuariosRepository.save(body);
    }

    @Override
    public void delete(Integer id) {
        _usuariosRepository.deleteById(id);
    }
}
