package com.geo.service.impl;

import com.geo.entity.Order;
import com.geo.repository.OrderRepository;
import com.geo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    @Transactional
    public Order getOrderById(Long id) {

        return orderRepository.findOne(id);
    }

    @Override
    @Transactional
    public void addOrder(Order order) {

        orderRepository.saveAndFlush(order);
    }

    @Override
    @Transactional
    public void updateOrder(Order order) {

        orderRepository.saveAndFlush(order);
    }
}
