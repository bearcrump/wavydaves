package com.wavydaves.api.services;

import com.wavydaves.api.repositories.ItemRepository;
import com.wavydaves.api.interfaces.IItemService;
import com.wavydaves.api.models.Item;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService implements IItemService {
    
    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> getAllItems() {
        return itemRepository.getAllItems();
    }

    public Item getItemById(Integer id) {
        var result = itemRepository.getItemById(id);
        if (result.isPresent()) {
            return result.get();
        }
        else {
            System.out.println("No items with Id " + id + "found.");
        }     
        return null;
    }

    public Item getItemByName(String name) {
        var result = itemRepository.getItemByName(name);
        if (result.isPresent()) {
            return result.get();
        }
        else {
            System.out.println("No items with name " + name + "found.");
        }     
        return null;
    }

    public List<Item> getItemsByCategory(String category) {
        var result = itemRepository.getItemsByCategory(category);
        if (result.isPresent()) {
            return result.get();
        }
        else {
            System.out.println("No items of category " + category + "found.");
        }     
        return null;
    }

    public Item upsertItem(Item item) {
        return itemRepository.save(item);
    }

    public void deleteItemById(Integer id) {
        itemRepository.deleteAllById(id);
    }
}
