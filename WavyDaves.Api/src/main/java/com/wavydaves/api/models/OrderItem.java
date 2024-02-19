package com.wavydaves.api.models;

public class OrderItem {
    private Integer id;
    private Integer orderId;
    private Integer itemId;
    private Integer quantity;


    public OrderItem() {

    }

    public OrderItem(Integer id, Integer orderId, Integer itemId, Integer quantity) {
        this.id = id;
        this.orderId = orderId;
        this.itemId = itemId;
        this.quantity = quantity;
    }

    public Integer id() {
        return id;
    }

    public OrderItem setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer orderId() {
        return orderId;
    }

    public OrderItem setOrderId(Integer orderId) {
        this.orderId = orderId;
        return this;
    }

    public Integer itemId() {
        return itemId;
    }

    public OrderItem setItemId(Integer itemId) {
        this.itemId = itemId;
        return this;
    }

    public Integer quantity() {
        return quantity;
    }

    public OrderItem setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
}
