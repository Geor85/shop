package com.geo.repository;

import com.geo.entity.Category;
import com.geo.entity.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


import java.util.List;

/**
 * Created by Георгий on 29.07.2017.
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> getAllBy(Pageable pageable);
    List<Product> findByNameLike(String name, Pageable pageable);
    List<Product> findByNameLikeOrDescriptionLikeOrAttributesSEOLike(String name, String description,
                                                                     String atributesSEO, Pageable pageable);
    List<Product> findByAvailability(boolean availability, Pageable pageable);
    List<Product> findByCategoryAndAvailability(Category category, boolean availability, Pageable pageable);
}
