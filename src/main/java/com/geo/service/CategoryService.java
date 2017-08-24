package com.geo.service;

import com.geo.entity.Category;


public interface CategoryService {
    Category getCategoryById(Long id);
    void addCategory(Category category);
    void updateCategory(Category category);
}
