package com.geo.repository;

import com.geo.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Георгий on 12.08.2017.
 */
public interface ImageRepository extends JpaRepository<Image, Long> {

}
