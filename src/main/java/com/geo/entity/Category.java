package com.geo.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;

    @OneToOne(orphanRemoval = true)
    private Image image;

    private boolean avail;
    private String SEOAttributes;

    @OneToMany
    private List<Product> products = new ArrayList<Product>();

    public Category() {
    }

    public Category(String name, Image image) {
        this.name = name;
        this.image = image;
    }

    public Category(String name, String description, Image image,
                    boolean avail, String SEOAttributes, List<Product> products) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.avail = avail;
        this.SEOAttributes = SEOAttributes;
        this.products = products;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public boolean isAvail() {
        return avail;
    }

    public void setAvail(boolean avail) {
        this.avail = avail;
    }

    public String getSEOAttributes() {
        return SEOAttributes;
    }

    public void setSEOAttributes(String SEOAttributes) {
        this.SEOAttributes = SEOAttributes;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
