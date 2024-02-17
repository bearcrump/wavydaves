package com.WavyDaves.Api.models;

public class Item {
    private Integer id;
    private String name;
    private String category;
    private Integer priceDollars;
    private Integer priceCents;
    private String size;

    public Item() {

    }

    public Item(Integer id, String name, String category, Integer priceDollars, Integer priceCents, String size) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.priceDollars = priceDollars;
        this.priceCents = priceCents;
        this.size = size;
    }

    public Integer id() {
        return id;
    }

    public Item setId(Integer id) {
        this.id = id;
        return this;
    }

    public String name() {
        return name;
    }

    public Item setName(String name) {
        this.name = name;
        return this;
    }

    public String category() {
        return category;
    }

    public Item setCategory(String category) {
        this.category = category;
        return this;
    }

    public Integer priceDollars() {
        return priceDollars;
    }

    public Item setPriceDollars(Integer priceDollars) {
        this.priceDollars = priceDollars;
        return this;
    }

    public Integer priceCents() {
        return priceCents;
    }

    public Item setPriceCents(Integer priceCents) {
        this.priceCents = priceCents;
        return this;
    }

    public String size() {
        return size;
    }

    public Item setSize(String size) {
        this.size = size;
        return this;
    }
}
