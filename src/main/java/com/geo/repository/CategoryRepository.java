package com.geo.repository;

import com.geo.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Георгий on 12.08.2017.
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
