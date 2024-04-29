package com.wavydaves.api.services;

import java.time.OffsetDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wavydaves.api.interfaces.IOrderService;
import com.wavydaves.api.models.Order;
import com.wavydaves.api.repositories.OrderRepository;

@Service
public class OrderService implements IOrderService {
    
    private final OrderRepository orderRepository;

    @Autowired
   public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order getOrderById(Integer id) {
        var result = orderRepository.getOrderById(id);
        if (result.isPresent()) {
            return result.get();
        }
        else {
            System.out.println("No orders with Id " + id + "found.");
        }     
        return null;
    }

    public List<Order> getOrdersByUserId(Integer userId) {
        var result = orderRepository.getOrdersByUserId(userId);
        if (result.isPresent()) {
            return result.get();
        }
        else {
            System.out.println("No orders with Id " + userId + "found.");
        }     
        return null;
    }

    public List<Order> getOrdersByAddressId(Integer addressId) {
        var result = orderRepository.getOrdersByAddressId(addressId);
        if (result.isPresent()) {
            return result.get();
        }
        else {
            System.out.println("No orders with addressId " + addressId + "found.");
        }     
        return null;
    }

    public List<Order> getOrdersByName(String name) {
        var result = orderRepository.getOrdersByName(name);
        if (result.isPresent()) {
            return result.get();
        }
        else {
            System.out.println("No orders with name " + name + "found.");
        }     
        return null;
    }

    public Order getOrderByTimestamp(OffsetDateTime timestamp) {
        var result = orderRepository.getOrderByTimestamp(timestamp);
        if (result.isPresent()) {
            return result.get();
        }
        else {
            System.out.println("No orders with timestamp " + timestamp + "found.");
        }     
        return null;
    }

    public Order upsertOrder(Order order) {
        return orderRepository.save(order);
    }

    public void deleteOrderById(Integer id) {
        orderRepository.deleteAllById(id);
    }
}
