package com.geo;

import com.geo.config.AppConfig;
import com.geo.entity.Order;
import com.geo.repository.OrderRepository;
import com.geo.service.OrderService;
import com.geo.service.UserService;
import com.geo.service.impl.OrderServiceImpl;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.websocket.Session;


public class Main {




    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
        OrderRepository orderRepository = context.getBean(OrderRepository.class);
        Order order = new Order();
        orderRepository.saveAndFlush(order);

        /*Session session = sessionFactory.openSession(); session.beginTransaction();
        Order order = new Order();
        OrderService orderService = new OrderServiceImpl();
        orderService.addOrder(order);
        System.out.println(order.getCreated());*/
    }
}
