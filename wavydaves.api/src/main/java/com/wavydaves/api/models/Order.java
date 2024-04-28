package com.wavydaves.api.models;

import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name="orders")
public class Order {
    private Integer id;
    @Nullable
    private Integer userId;
    @Nullable
    private Integer addressId;
    private String paymentType;
    private String name;
    private OffsetDateTime orderTime;
    private Integer totalDollars;
    private Integer totalCents;
    private Boolean isDelivery;
    //private List<Item> orderItems; Determined these may be a separate table in db. ORM map them onto one app model? doable in Java/Springboot?

    public Order() {

    }

    public Order(Integer id, @Nullable Integer userId, @Nullable Integer addressId, String paymentType, String name, OffsetDateTime orderTime,
                 Integer totalDollars, Integer totalCents, Boolean isDelivery, List<Item> orderItems) {
        this.id = id;
        this.userId = userId;
        this.addressId = addressId;
        this.paymentType = paymentType;
        this.name = name;
        this.orderTime = orderTime;
        this.totalDollars = totalDollars;
        this.totalCents = totalCents;
        this.isDelivery = isDelivery;
        //this.orderItems = orderItems;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "userid", nullable = true)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(@Nullable Integer userId) {
        this.userId = userId;
    }

    @Column(name = "addressid", nullable = true)
    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(@Nullable Integer addressId) {
        this.addressId = addressId;
    }

    @Column(name = "paymenttype")
    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "ordertime")
    public OffsetDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(OffsetDateTime orderTime) {
        this.orderTime = orderTime;
    }

    @Column(name = "totaldollars")
    public Integer getTotalDollars() {
        return totalDollars;
    }

    public void setTotalDollars(Integer totalDollars) {
        this.totalDollars = totalDollars;
    }

    @Column(name = "totalcents")
    public Integer getTotalCents() {
        return totalCents;
    }

    public void setTotalCents(Integer totalCents) {
        this.totalCents = totalCents;
    }

    @Column(name = "isdelivery")
    public Boolean getDelivery() {
        return isDelivery;
    }

    public void setDelivery(Boolean delivery) {
        isDelivery = delivery;
    }
}
