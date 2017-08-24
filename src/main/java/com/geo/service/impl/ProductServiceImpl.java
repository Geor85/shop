package com.geo.service.impl;

import com.geo.entity.Category;
import com.geo.entity.Product;
import com.geo.repository.ProductRepository;
import com.geo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    @Transactional
    public Product getProductById(Long id) {
        return productRepository.findOne(id);
    }

    @Override
    @Transactional
    public List<Product> getAllProducts(Pageable pageable) {
        return productRepository.getAllBy(pageable);
    }

    @Override
    @Transactional
    public List<Product> getAllProductsByAvailability(boolean availability, Pageable pageable) {
        return productRepository.findByAvailability(availability, pageable);
    }

    @Override
    @Transactional
    public List<Product> getAvailableProductsByCategory(Category category, Pageable pageable) {
        boolean available = true;
        return productRepository.findByCategoryAndAvailability(category, available, pageable);
    }

    @Override
    @Transactional
    public List<Product> getProductsByName(String productName, Pageable pageable) {

        return productRepository.findByNameLike(productName, pageable);
    }

    @Override
    @Transactional
    public List<Product> getProductsByNameOrDescriptionOrAttributesSEO(String word, Pageable pageable) {
        return productRepository.findByNameLikeOrDescriptionLikeOrAttributesSEOLike(word, word, word, pageable);
    }

    @Override
    @Transactional
    public void deleteProductById(Long id) {

    }

    @Override
    @Transactional
    public void addProduct(Product product) {

    }

    @Override
    @Transactional
    public void updateProduct(Product product) {

    }
}
