package com.wavydaves.api.models;

import jakarta.persistence.*;

@Entity
@Table(name="items")
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

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name="category")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Column(name="priceDollars")
    public Integer getPriceDollars() {
        return priceDollars;
    }

    public void setPriceDollars(Integer priceDollars) {
        this.priceDollars = priceDollars;
    }

    @Column(name="pricecents")
    public Integer getPriceCents() {
        return priceCents;
    }

    public void setPriceCents(Integer priceCents) {
        this.priceCents = priceCents;
    }

    @Column(name="size")
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
