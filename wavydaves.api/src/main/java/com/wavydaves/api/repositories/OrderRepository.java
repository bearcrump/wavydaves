package com.wavydaves.api.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.wavydaves.api.models.Order;
import jakarta.transaction.Transactional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
    
    















    // @Query("SELECT u FROM Item u")
    // List<Item> getAllItems();

    // @Query("SELECT u FROM Item u where u.id = ?1")
    // Optional<Item> getItemById(Integer id);

    // @Query("SELECT u FROM Item u where u.name = ?1")
    // Optional<Item> getItemByName(String name);

    // @Query("SELECT u FROM Item u where u.category = ?1")
    // Optional<List<Item>> getItemsByCategory(String category);

    // @Transactional
    // Item save(Item item);

    // @Transactional
    // void deleteAllById(Integer id);
}
