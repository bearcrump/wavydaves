package com.wavydaves.api.models;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getPriceDollars() {
        return priceDollars;
    }

    public void setPriceDollars(Integer priceDollars) {
        this.priceDollars = priceDollars;
    }

    public Integer getPriceCents() {
        return priceCents;
    }

    public void setPriceCents(Integer priceCents) {
        this.priceCents = priceCents;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
