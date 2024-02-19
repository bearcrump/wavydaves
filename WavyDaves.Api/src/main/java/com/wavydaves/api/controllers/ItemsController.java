package com.wavydaves.api.controllers;

import com.wavydaves.api.interfaces.IItemService;
import com.wavydaves.api.models.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping("api/v1/items")
public class ItemsController {

    private final IItemService itemService;
    private  ArrayList<Item> fakeItems = new ArrayList<Item>();

    @Autowired
    public ItemsController(IItemService itemService) {
        this.itemService = itemService;

        // seed controller with hardcoded dummy data
        addFakeItems();
    }

    public void addFakeItems() {
        Item pizza = new Item(null, "Pizza", "Pizza", 14, 99, "Medium" );
        Item carbonatedMilk = new Item(null, "Carbonated Milk", "Beverage", 3, 99, "Half Gallon" );
        Item wavyGravy = new Item(null, "Wavy Gravy", "Condiment", 0, 99, "1 cup" );
        Item sammich = new Item(null, "Sammich", "Sandwich", 6, 99, "Full" );
        Item hotDogWater = new Item (null, "Hot Dog Water", "Beverage", 3, 99, "2 Liter" );

        fakeItems.add(pizza);
        fakeItems.add(carbonatedMilk);
        fakeItems.add(wavyGravy);
        fakeItems.add(sammich);
        fakeItems.add(hotDogWater);
    }

    @GetMapping
    public ResponseEntity<ArrayList<Item>> getItems() {
        try {
            return ResponseEntity.ok(fakeItems);
        }
        catch(Exception ex) {
            System.out.println("Exception Message: " + ex.getMessage());
            ex.printStackTrace();
        }
        return null;
    }

    @PostMapping
    public void postItem() {
        throw new RuntimeException("Method not implemented");
    }

    @PutMapping
    public void putItem() {
        throw new RuntimeException("Method not implemented");
    }

    @DeleteMapping
    public void deleteItem() {
        throw new RuntimeException("Method not implemented");
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred: " + e.getMessage());
    }

}
