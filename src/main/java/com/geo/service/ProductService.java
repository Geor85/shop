package com.geo.service;


import com.geo.entity.Category;
import com.geo.entity.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.access.method.P;

import java.util.List;

public interface ProductService {
    Product getProductById(Long id);
    List<Product> getAllProducts(Pageable pageable);
    List<Product> getAllProductsByAvailability(boolean availability, Pageable pageable);
    List<Product> getAvailableProductsByCategory(Category category, Pageable pageable);
    List<Product> getProductsByName(String productName, Pageable pageable);
    List<Product> getProductsByNameOrDescriptionOrAttributesSEO(String word, Pageable pageable);
    void deleteProductById(Long id);
    void addProduct(Product product);
    void updateProduct(Product product);

}
