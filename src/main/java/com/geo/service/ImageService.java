package com.geo.service;


import com.geo.entity.Image;

import java.util.List;

public interface ImageService {
    Image getImageById(Long id);
    void addImage(Image image);
    void updateImage(Image image);
}
