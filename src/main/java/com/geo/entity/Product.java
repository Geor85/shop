package com.geo.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;

    @OneToMany(orphanRemoval=true)
    private List<Image> images = new ArrayList<Image>();
    private Double price;
    private boolean availability;
    private String attributesSEO;
    @ManyToOne
    private Category category;

    public Product() {
    }

    public Product(String name, Double price, boolean avalability) {
        this.name = name;
        this.price = price;
        this.availability = avalability;
    }

    public Product(Long id, String name, String description, ArrayList<Image> images,
                   Double price, boolean availability, String attributesSEO, Category category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.images = images;
        this.price = price;
        this.availability = availability;
        this.attributesSEO = attributesSEO;
        this.category = category;
    }

    public Long getId() {
        return id;
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

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public Double getPrice() {

        return price;
    }

    public void setPrice(Double price) {

        this.price = price;
    }

    public boolean isAvailability() {

        return availability;
    }

    public void setAvailability(boolean availability) {

        this.availability = availability;
    }

    public String getAttributesSEO() {

        return attributesSEO;
    }

    public void setAttributesSEO(String attributesSEO) {

        this.attributesSEO = attributesSEO;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
