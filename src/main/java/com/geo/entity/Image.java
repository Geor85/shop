package com.geo.entity;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "images")
public class Image {
    @Id
    @GeneratedValue
    private Long id;
    @Lob
    private byte[] image;

    public Image() {
    }

    public Long getId() {
        return id;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
