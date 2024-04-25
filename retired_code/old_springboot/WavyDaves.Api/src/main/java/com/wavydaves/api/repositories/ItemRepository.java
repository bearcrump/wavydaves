package com.wavydaves.api.repositories;

import com.wavydaves.api.models.Item;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
    
    @Query("SELECT u FROM Item u")
    List<Item> getAllItems();

    @Query("SELECT u FROM Item u where u.id = ?1")
    Optional<Item> getItemById(Integer id);

    @Query("SELECT u FROM Item u where u.name = ?1")
    Optional<Item> getItemByName(String name);

    @Query("SELECT u FROM Item u where u.category = ?1")
    Optional<List<Item>> getItemsByCategory(String category);

    @Transactional
    Item save(Item item);

    @Transactional
    void deleteAllById(Integer id);
}
