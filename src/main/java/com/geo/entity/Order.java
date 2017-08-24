package com.geo.entity;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="customer_name")
    private String customerName;                   //if without registering

    @Column(name="customer_surname")
    private String customerSurname;                //if without registering

    @Column(name="customer_patronymic")
    private String customerPatronymic;             //if without registering

    @ManyToOne
    User user;

    @Column(name="delivery_service")
    private String deliveryService;

    @Column(name="delivery_address")
    private String deliveryAddress;

    @Column(name="payment_method")
    private String paymentMethod;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created", nullable = false)
    private Date created = new Date();

    @OneToMany(mappedBy = "order",fetch = FetchType.EAGER, cascade = {CascadeType.ALL}, orphanRemoval=true)
    private List<OrderDetails> orderDetails = new ArrayList<OrderDetails>();

    @Column(name="total_price")
    private Double totalPrice;

    private String comment;


    public Order() {
    }

    public Order(User user, String deliveryService, String deliveryAddress, String paymentMethod, Date created,
                 List<OrderDetails> orderDetails, Double totalPrice, String comment) {
        this.user = user;
        this.deliveryService = deliveryService;
        this.deliveryAddress = deliveryAddress;
        this.paymentMethod = paymentMethod;
        this.created = created;
        this.orderDetails = orderDetails;
        this.totalPrice = totalPrice;
        this.comment = comment;
    }

    public Order(String customerName, String customerSurname, String customerPatronymic,
                 String deliveryService, String deliveryAddress, String paymentMethod, Date created,
                 List<OrderDetails> orderDetails, Double totalPrice, String comment) {
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.customerPatronymic = customerPatronymic;
        this.deliveryService = deliveryService;
        this.deliveryAddress = deliveryAddress;
        this.paymentMethod = paymentMethod;
        this.created = created;
        this.orderDetails = orderDetails;
        this.totalPrice = totalPrice;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    public String getCustomerPatronymic() {
        return customerPatronymic;
    }

    public void setCustomerPatronymic(String customerPatronymic) {
        this.customerPatronymic = customerPatronymic;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDeliveryService() {
        return deliveryService;
    }

    public void setDeliveryService(String deliveryService) {
        this.deliveryService = deliveryService;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public List<OrderDetails> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetails> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
