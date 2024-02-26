package com.wavydaves.api.interfaces;

import com.wavydaves.api.models.Item;
import java.util.List;

public interface IItemService {
    public List<Item> getAllItems();
    public Item getItemById(Integer id);
    public Item getItemByName(String name);
    public List<Item> getItemsByCategory(String category);
    public Item upsertItem(Item item);
    public void deleteItem(Integer id);
}
