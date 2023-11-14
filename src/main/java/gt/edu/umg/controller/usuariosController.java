package gt.edu.umg.controller;

import gt.edu.umg.dao.usuariosDao;
import gt.edu.umg.entity.usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("usuarios")
@CrossOrigin(origins = "*")
public class usuariosController {
    @Autowired
    private usuariosDao _usuariosDao;

    @GetMapping
    public ResponseEntity<List<usuarios>> findAll() {
        List<usuarios> countries = _usuariosDao.findAll();

        return new ResponseEntity<>(countries, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Optional<usuarios>> findById(@PathVariable Integer id) {
        return new ResponseEntity<>(_usuariosDao.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> save(@RequestBody usuarios body) {
        _usuariosDao.save(body);

        return new ResponseEntity<>("Creado satisfactoriamente", HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<String> update(@PathVariable Integer id, @RequestBody usuarios body) {
        _usuariosDao.update(id, body);

        return new ResponseEntity<>("Actualizado satisfactoriamente", HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id) {
        _usuariosDao.delete(id);

        return new ResponseEntity<>("Eliminado Satisfactoriamente", HttpStatus.OK);
    }
}

