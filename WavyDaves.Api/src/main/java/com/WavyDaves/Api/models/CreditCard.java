package com.WavyDaves.Api.models;

import org.springframework.lang.Nullable;
import java.time.ZonedDateTime;

public class CreditCard {
    private Integer id;
    private Integer addressId;
    @Nullable
    private Integer userId;
    private Integer cardNumber;
    private String name;
    private ZonedDateTime expirationDate;

    public CreditCard() {

    }

    public CreditCard(Integer id, Integer addressId, @Nullable Integer userId, Integer cardNumber, String name, ZonedDateTime expirationDate) {
        this.id = id;
        this.addressId = addressId;
        this.userId = userId;
        this.cardNumber = cardNumber;
        this.name = name;
        this.expirationDate = expirationDate;
    }

    public Integer id() {
        return id;
    }

    public CreditCard setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer addressId() {
        return addressId;
    }

    public CreditCard setAddressId(Integer addressId) {
        this.addressId = addressId;
        return this;
    }

    @Nullable
    public Integer userId() {
        return userId;
    }

    public CreditCard setUserId(@Nullable Integer userId) {
        this.userId = userId;
        return this;
    }

    public Integer cardNumber() {
        return cardNumber;
    }

    public CreditCard setCardNumber(Integer cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }

    public String name() {
        return name;
    }

    public CreditCard setName(String name) {
        this.name = name;
        return this;
    }

    public ZonedDateTime expirationDate() {
        return expirationDate;
    }

    public CreditCard setExpirationDate(ZonedDateTime expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }
}

