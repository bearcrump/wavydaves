package com.wavydaves.api.models;

import jakarta.persistence.*;

@Entity
@Table(name="orderitems")
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

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "orderid")
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @Column(name = "itemid")
    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    @Column(name = "quantity")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
