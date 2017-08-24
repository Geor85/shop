package com.geo.service.impl;

import com.geo.entity.OrderDetails;
import com.geo.repository.OrderDetailsRepository;
import com.geo.service.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {
    @Autowired
    OrderDetailsRepository orderDetailsRepository;

    @Override
    @Transactional
    public OrderDetails getOrderDetailsById(Long id) {
        return orderDetailsRepository.getOne(id);
    }

    @Override
    @Transactional
    public void addOrderDetails(OrderDetails orderDetails) {
     orderDetailsRepository.saveAndFlush(orderDetails);
    }

    @Override
    public void updateOrderDetails(OrderDetails orderDetails) {
        orderDetailsRepository.saveAndFlush(orderDetails);

    }
}
