package com.WavyDaves.Api.models;

import org.springframework.lang.Nullable;

import java.time.ZonedDateTime;

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

    public Order() {

    }

    public Order(Integer id, @Nullable Integer userId, @Nullable Integer addressId, String paymentType, String name, ZonedDateTime orderDate,
                 Integer totalDollars, Integer totalCents, Boolean isDelivery) {
        this.id = id;
        this.userId = userId;
        this.addressId = addressId;
        this.paymentType = paymentType;
        this.name = name;
        this.orderDate = orderDate;
        this.totalDollars = totalDollars;
        this.totalCents = totalCents;
        this.isDelivery = isDelivery;
    }

    public Integer id() {
        return id;
    }

    public Order setId(Integer id) {
        this.id = id;
        return this;
    }

    @Nullable
    public Integer userId() {
        return userId;
    }

    public Order setUserId(@Nullable Integer userId) {
        this.userId = userId;
        return this;
    }

    @Nullable
    public Integer addressId() {
        return addressId;
    }

    public Order setAddressId(@Nullable Integer addressId) {
        this.addressId = addressId;
        return this;
    }

    public String paymentType() {
        return paymentType;
    }

    public Order setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }

    public String name() {
        return name;
    }

    public Order setName(String name) {
        this.name = name;
        return this;
    }

    public ZonedDateTime orderDate() {
        return orderDate;
    }

    public Order setOrderDate(ZonedDateTime orderDate) {
        this.orderDate = orderDate;
        return this;
    }

    public Integer totalDollars() {
        return totalDollars;
    }

    public Order setTotalDollars(Integer totalDollars) {
        this.totalDollars = totalDollars;
        return this;
    }

    public Integer totalCents() {
        return totalCents;
    }

    public Order setTotalCents(Integer totalCents) {
        this.totalCents = totalCents;
        return this;
    }

    public Boolean isDelivery() {
        return isDelivery;
    }

    public Order setDelivery(Boolean delivery) {
        isDelivery = delivery;
        return this;
    }
}
