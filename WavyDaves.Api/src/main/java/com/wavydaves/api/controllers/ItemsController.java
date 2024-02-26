package com.wavydaves.api.controllers;

import com.wavydaves.api.interfaces.IItemService;
import com.wavydaves.api.models.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/v1/items")
public class ItemsController {

    private final IItemService itemService;
    //private  ArrayList<Item> fakeItems = new ArrayList<Item>();

    @Autowired
    public ItemsController(IItemService itemService) {
        this.itemService = itemService;
    }

    // public void addFakeItems() {
    //     Item pizza = new Item(null, "Pizza", "Pizza", 14, 99, "Medium" );
    //     Item carbonatedMilk = new Item(null, "Carbonated Milk", "Beverage", 3, 99, "Half Gallon" );
    //     Item wavyGravy = new Item(null, "Wavy Gravy", "Condiment", 0, 99, "1 cup" );
    //     Item sammich = new Item(null, "Sammich", "Sandwich", 6, 99, "Full" );
    //     Item hotDogWater = new Item (null, "Hot Dog Water", "Beverage", 3, 99, "2 Liter" );

    //     fakeItems.add(pizza);
    //     fakeItems.add(carbonatedMilk);
    //     fakeItems.add(wavyGravy);
    //     fakeItems.add(sammich);
    //     fakeItems.add(hotDogWater);
    // }

    @GetMapping
    public ResponseEntity<List<Item>> getItems() {
        return ResponseEntity.ok(itemService.getAllItems());
    }

    @GetMapping("/id")
    public ResponseEntity<Item> getItemById(@RequestParam Integer id) {
        return ResponseEntity.ok(itemService.getItemById(id));
    }

    @GetMapping("/name")
    public ResponseEntity<Item> getItemByName(@RequestParam String name) {
        return ResponseEntity.ok(itemService.getItemByName(name));
    }

    @GetMapping("/category")
    public ResponseEntity<List<Item>> getItemByCategory(@RequestParam String category) {
        return ResponseEntity.ok(itemService.getItemsByCategory(category));
    }

    @PostMapping
    public ResponseEntity<Item> postItem(@RequestBody Item item) {
        return ResponseEntity.ok(itemService.upsertItem(item));
    }

    @PutMapping
    public ResponseEntity<Item> putItem(@RequestBody Item item) {
        return ResponseEntity.ok(itemService.upsertItem(item));
    }

    @DeleteMapping
    public void deleteItem(Integer id) {
        itemService.deleteItem(id);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred: " + e.getMessage());
    }

}
