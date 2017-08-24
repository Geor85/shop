package com.geo.service.impl;

import com.geo.entity.Image;
import com.geo.repository.ImageRepository;
import com.geo.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ImageServiceImpl implements ImageService {
    @Autowired
    ImageRepository imageRepository;

    @Override
    @Transactional
    public Image getImageById(Long id) {
        return imageRepository.findOne(id);
    }

    @Override
    @Transactional
    public void addImage(Image image) {

        imageRepository.saveAndFlush(image);
    }

    @Override
    @Transactional
    public void updateImage(Image image) {

        imageRepository.saveAndFlush(image);
    }
}
