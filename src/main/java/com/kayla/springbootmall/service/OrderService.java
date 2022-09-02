package com.kayla.springbootmall.service;

import com.kayla.springbootmall.dto.CreateOrderRequest;
import com.kayla.springbootmall.dto.OrderQueryParams;
import com.kayla.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Integer countOrder(OrderQueryParams orderQueryParams);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);
}
