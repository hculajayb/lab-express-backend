package gt.edu.umg.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import gt.edu.umg.entity.Items;
import gt.edu.umg.services.ItemsService;

@RestController
@RequestMapping("items")
@CrossOrigin(origins = "*")
public class ItemsController {

    @Autowired
    private final ItemsService itemsService;

    public ItemsController(ItemsService itemsService) {
        this.itemsService = itemsService;
    }

    @GetMapping
    public List<Items> getAllItems() {
        return itemsService.getAllItems();
    }

    @GetMapping("/{id}")
    public Items getItemById(@PathVariable int id) {
        return itemsService.getItemById(id);
    }

    @PostMapping
    public Items createItem(@RequestBody Items items) { return itemsService.createItem(items);}

    @PutMapping("/{id}")
    public Items updateItem(@PathVariable int id, @RequestBody Items items) {
        return itemsService.updateItem(id, items);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable int id) {
        itemsService.deleteItem(id);
    }
}