package com.WavyDaves.Api.models;

import org.springframework.lang.Nullable;

public class User {
    private Integer id;
    private Integer creditCardId;
    private Integer addressId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    private Boolean isAdmin;

    public User() {

    }
    public User(Integer id, Integer creditCardId, Integer addressId, String firstName, String lastName,
                String email, String password, String phoneNumber, Boolean isAdmin) {
        this.id = id;
        this.creditCardId = creditCardId;
        this.addressId = addressId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.isAdmin = isAdmin;
    }

    public Integer id() {
        return id;
    }

    public User setId(Integer id) {
        this.id = id;
        return this;
    }

    @Nullable
    public Integer creditCardId() {
        return creditCardId;
    }

    public User setCreditCardId(@Nullable Integer creditCardId) {
        this.creditCardId = creditCardId;
        return this;
    }

    @Nullable
    public Integer addressId() {
        return addressId;
    }

    public User setAddressId(@Nullable Integer addressId) {
        this.addressId = addressId;
        return this;
    }

    public String firstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String lastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String email() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String password() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    @Nullable
    public String phoneNumber() {
        return phoneNumber;
    }

    public User setPhoneNumber(@Nullable String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Boolean isAdmin() {
        return isAdmin;
    }

    public User setAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
        return this;
    }
}
