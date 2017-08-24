package com.geo.service.impl;


import com.geo.entity.Category;
import com.geo.repository.CategoryRepository;
import com.geo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    @Override
    @Transactional
    public Category getCategoryById(Long id) {
        return categoryRepository.findOne(id);
    }

    @Override
    @Transactional
    public void addCategory(Category category) {

        categoryRepository.saveAndFlush(category);
    }

    @Override
    @Transactional
    public void updateCategory(Category category) {

        categoryRepository.saveAndFlush(category);
    }
}
