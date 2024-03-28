package com.wavydaves.api.models;

import jakarta.persistence.*;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;

@Entity
@Table(name="creditcards")
public class CreditCard {
    private Integer id;
    private Integer addressId;
    @Nullable
    private Integer userId;
    private Integer cardNumber;
    private String name;
    private OffsetDateTime expirationDate;

    public CreditCard() {

    }

    public CreditCard(Integer id, Integer addressId, @Nullable Integer userId, Integer cardNumber, String name, OffsetDateTime expirationDate) {
        this.id = id;
        this.addressId = addressId;
        this.userId = userId;
        this.cardNumber = cardNumber;
        this.name = name;
        this.expirationDate = expirationDate;
    }

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name="addressid")
    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    @Column(name="userid", nullable = true)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(@Nullable Integer userId) {
        this.userId = userId;
    }

    @Column(name="cardnumber")
    public Integer getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name="expirationdate")
    public OffsetDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(OffsetDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }
}

