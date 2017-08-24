package com.geo.service;


import com.geo.entity.OrderDetails;

public interface OrderDetailsService {
    OrderDetails getOrderDetailsById(Long id);
    void addOrderDetails(OrderDetails orderDetails);
    void updateOrderDetails(OrderDetails orderDetails);
}
