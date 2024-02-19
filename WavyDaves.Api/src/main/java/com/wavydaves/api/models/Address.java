package com.wavydaves.api.models;

import org.springframework.lang.Nullable;

public class Address {
    private Integer id;
    private String country;
    private String state;
    private String city;
    private String line1;
    @Nullable
    private String line2;
    private Integer zip;

    public Address() {

    }
    public Address(Integer id, String country, String state, String city, String line1, @Nullable String line2, Integer zip) {
        this.id = id;
        this.country = country;
        this.state = state;
        this.city = city;
        this.line1 = line1;
        this.line2 = line2;
        this.zip = zip;
    }
    public Integer id() {
        return id;
    }

    public Address setId(Integer id) {
        this.id = id;
        return this;
    }

    public String country() {

        return country;
    }

    public Address setCountry(String country) {
        this.country = country;
        return this;
    }

    public String state() {

        return state;
    }

    public Address setState(String state) {
        this.state = state;
        return this;
    }

    public String city() {

        return city;
    }

    public Address setCity(String city) {
        this.city = city;
        return this;
    }

    public String line1() {

        return line1;
    }

    public Address setLine1(String line1) {
        this.line1 = line1;
        return this;
    }

    @Nullable
    public String line2() {

        return line2;
    }

    public Address setLine2(@Nullable String line2) {
        this.line2 = line2;
        return this;
    }

    public Integer zip() {

        return zip;
    }

    public Address setZip(Integer zip) {
        this.zip = zip;
        return this;
    }
}
