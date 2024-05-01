package com.wavydaves.api.repositories;

import java.util.List;
import java.util.Optional;
import java.time.OffsetDateTime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.wavydaves.api.models.Order;

import jakarta.transaction.Transactional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
    
    // Apparently only raw queries work in this particular table? 
    // Looks like we were having trouble mapping to the JPA type and 
    // Query language

    //@Query("SELECT u FROM Order where u.id = ?1")
    @Query(nativeQuery = true, value = "SELECT * FROM orders WHERE id = :id")
    Optional<Order> getOrderById(Integer id);

    //@Query("SELECT u FROM Order where u.userId = ?1")
    @Query(nativeQuery = true, value = "SELECT * FROM orders WHERE userid = :userId")
    Optional<List<Order>> getOrdersByUserId(Integer userId);

    @Query(nativeQuery = true, value = "SELECT * FROM orders WHERE addressid = :addressId")
    Optional<List<Order>> getOrdersByAddressId(Integer addressId);

    //@Query("SELECT u FROM Order where u.name = ?1")
    @Query(nativeQuery = true, value = "SELECT * FROM orders WHERE name = :name")
    Optional<List<Order>> getOrdersByName(String name);

    @Query(nativeQuery = true, value ="SELECT * FROM orders WHERE timestamp = :timestamp")
    Optional<Order> getOrderByTimestamp(OffsetDateTime timestamp);

    @Transactional
    Order save(Order order);

    @Transactional
    void deleteAllById(Integer id);
}
