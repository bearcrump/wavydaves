package com.wavydaves.api.models;

import org.springframework.lang.Nullable;
import java.time.ZonedDateTime;
import java.util.List;

public class Order {
    private Integer id;
    @Nullable
    private Integer userId;
    @Nullable
    private Integer addressId;
    private String paymentType;
    private String name;
    private ZonedDateTime orderDate;
    private Integer totalDollars;
    private Integer totalCents;
    private Boolean isDelivery;
    private List<Item> orderItems;

    public Order() {

    }

    public Order(Integer id, @Nullable Integer userId, @Nullable Integer addressId, String paymentType, String name, ZonedDateTime orderDate,
                 Integer totalDollars, Integer totalCents, Boolean isDelivery, List<Item> orderItems) {
        this.id = id;
        this.userId = userId;
        this.addressId = addressId;
        this.paymentType = paymentType;
        this.name = name;
        this.orderDate = orderDate;
        this.totalDollars = totalDollars;
        this.totalCents = totalCents;
        this.isDelivery = isDelivery;
        this.orderItems = orderItems;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Nullable
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(@Nullable Integer userId) {
        this.userId = userId;
    }

    @Nullable
    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(@Nullable Integer addressId) {
        this.addressId = addressId;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ZonedDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(ZonedDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getTotalDollars() {
        return totalDollars;
    }

    public void setTotalDollars(Integer totalDollars) {
        this.totalDollars = totalDollars;
    }

    public Integer getTotalCents() {
        return totalCents;
    }

    public void setTotalCents(Integer totalCents) {
        this.totalCents = totalCents;
    }

    public Boolean getDelivery() {
        return isDelivery;
    }

    public void setDelivery(Boolean delivery) {
        isDelivery = delivery;
    }

    public List<Item> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<Item> orderItems) {
        this.orderItems = orderItems;
    }
}
