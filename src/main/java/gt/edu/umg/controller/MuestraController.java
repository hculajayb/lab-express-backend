package gt.edu.umg.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import gt.edu.umg.entity.Muestra;
import gt.edu.umg.services.MuestraService;

@RestController
@RequestMapping("muestras")
@CrossOrigin(origins = "*")
public class MuestraController {
	
	 @Autowired
	  private final MuestraService muestraService;

	   
	    public MuestraController(MuestraService muestraService) {
	        this.muestraService = muestraService;
	    }

	    @GetMapping
	    public List<Muestra> getAllMuestras() {
	        return muestraService.getAllMuestras();
	    }

	    @GetMapping("/{id}")
	    public Muestra getMuestraById(@PathVariable int id) {
	        return muestraService.getMuestraById(id);
	    }

	    @PostMapping
	    public Muestra createMuestra(@RequestBody Muestra muestra) {
	        return muestraService.createMuestra(muestra);
	    }

	    @PutMapping("/{id}")
	    public Muestra updateMuestra(@PathVariable int id, @RequestBody Muestra muestra) {
	        return muestraService.updateMuestra(id, muestra);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteMuestra(@PathVariable int id) {
	        muestraService.deleteMuestra(id);
	    }
}
