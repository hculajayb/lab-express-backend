package gt.edu.umg.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import gt.edu.umg.entity.MuestraItem;
import gt.edu.umg.services.MuestraItemService;

@RestController
@RequestMapping("muestrasItem")
@CrossOrigin(origins = "*")
public class MuestraItemController {

    @Autowired
    private final MuestraItemService muestraItemService;


    public MuestraItemController(MuestraItemService muestraItemService) {
        this.muestraItemService = muestraItemService;
    }

    @GetMapping
    public List<MuestraItem> getAllMuestrasItems() {
        return muestraItemService.getAllMuestrasItems();
    }

    @GetMapping("/{id}")
    public MuestraItem getMuestraItemById(@PathVariable int id) {
        return muestraItemService.getMuestraItemById(id);
    }

    @PostMapping
    public MuestraItem createMuestraItem(@RequestBody MuestraItem muestraItem) {
        return muestraItemService.createMuestraItem(muestraItem);
    }

    @PutMapping("/{id}")
    public MuestraItem updateMuestraItem(@PathVariable int id, @RequestBody MuestraItem muestraItem) {
        return muestraItemService.updateMuestraItem(id, muestraItem);
    }

    @DeleteMapping("/{id}")
    public void deleteMuestraItem(@PathVariable int id) {
        muestraItemService.deleteMuestraItem(id);
    }
}