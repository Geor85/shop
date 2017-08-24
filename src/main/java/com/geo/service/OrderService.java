package com.geo.service;

import com.geo.entity.Order;
import com.geo.entity.User;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;


public interface OrderService  {
    Order getOrderById(Long id);
    ArrayList<Order> getAllOrders(Pageable pageable);
    ArrayList<Order> getOrdersByUser(User user, Pageable pageable);
    ArrayList<Order> getOrdersByDate
    void addOrder(Order order);
    void updateOrder(Order order);
}
