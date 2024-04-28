package com.wavydaves.api.controllers;

import java.util.List;
import java.time.OffsetDateTime;
import com.wavydaves.api.interfaces.IOrderService;
import com.wavydaves.api.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/orders")
public class OrderController {

    private final IOrderService orderService;
    
    @Autowired
    public OrderController(IOrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("id")
    public ResponseEntity<Order> getOrderById(@RequestParam Integer id){
        return ResponseEntity.ok(orderService.getOrderById(id));
    }

    @GetMapping("user_id")
    public ResponseEntity<List<Order>> getOrdersByUserId(@RequestParam Integer userId) {
        return ResponseEntity.ok(orderService.getOrdersByUserId(userId));
    }

    @GetMapping("address_id")
    public ResponseEntity<List<Order>> getOrdersByAddressId(@RequestParam Integer addressId) {
        return ResponseEntity.ok(orderService.getOrdersByAddressId(addressId));
    }

    @GetMapping("name")
    public ResponseEntity<List<Order>> getOrdersByName(@RequestParam String name) {
        return ResponseEntity.ok(orderService.getOrdersByName(name));
    }

    @GetMapping("timestamp")
    public ResponseEntity<Order> getOrderByTimestamp(@RequestParam OffsetDateTime timestamp) {
        return ResponseEntity.ok(orderService.getOrderByTimestamp(timestamp));
    }

    @PostMapping
    public ResponseEntity<Order> upsertOrder(@RequestBody Order order) {
        return ResponseEntity.ok(orderService.upsertOrder(order));
    }

    @DeleteMapping
    public void deleteOrderById(@RequestParam Integer id) {
        orderService.deleteOrderById(id);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred: " + e.getMessage());
    }
}

