package com.wavydaves.api.interfaces;

import java.util.List;

import com.wavydaves.api.models.Order;

public interface IOrderService {
    public Order getOrderById(Integer id);
    public List<Order> getOrdersByUserId(Integer userId);
    public List<Order> getOrdersByAddressId(Integer addressId);
    public List<Order> getOrdersByName(String name);
    //public Order getOrderByTimestamp(OffsetDateTime timestamp);
    public Order upsertOrder(Order order);
    public void deleteOrderById(Integer id);
 }