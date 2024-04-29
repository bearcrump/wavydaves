package com.wavydaves.api.repositories;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wavydaves.api.models.Order;

import jakarta.transaction.Transactional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
    
    @Query("SELECT u FROM Order where u.id=?1")
    Optional<Order> getOrderById(Integer id);

    @Query("SELECT U FROM Order where u.userId=?1")
    Optional<List<Order>> getOrdersByUserId(Integer userId);

    @Query("SELECT U FROM Order where u.addressId=?1")
    Optional<List<Order>> getOrdersByAddressId(Integer addressId);

    @Query("SELECT U FROM Order where u.name=?1")
    Optional<List<Order>> getOrdersByName(String name);

    @Query("SELECT U FROM Order where u.timestamp=?1")
    Optional<Order> getOrderByTimestamp(OffsetDateTime timestamp);

    @Transactional
    Order save(Order order);

    @Transactional
    void deleteAllById(Integer id);
}
