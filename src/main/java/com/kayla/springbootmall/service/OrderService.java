package com.kayla.springbootmall.service;

import com.kayla.springbootmall.dto.CreateOrderRequest;
import com.kayla.springbootmall.model.Order;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);
}
