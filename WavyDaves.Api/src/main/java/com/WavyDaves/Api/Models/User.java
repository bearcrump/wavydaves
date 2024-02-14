package com.WavyDaves.Api.Models;

import org.springframework.lang.Nullable;

public class User {
    private Integer id;
    @Nullable
    private Integer creditCardId;
    @Nullable
    private Integer addressId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    @Nullable
    private String phoneNumber;
    private Boolean isAdmin;

    public User(String firstName, String lastName, String email, String password, Boolean isAdmin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.isAdmin = isAdmin;
    }
    public User(String firstName, String lastName, String email, String password, String phoneNumber, Boolean isAdmin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.isAdmin = isAdmin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Nullable
    public Integer getCreditCardId() {
        return creditCardId;
    }

    public void setCreditCardId(@Nullable Integer creditCardId) {
        this.creditCardId = creditCardId;
    }

    @Nullable
    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(@Nullable Integer addressId) {
        this.addressId = addressId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Nullable
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(@Nullable String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

}
