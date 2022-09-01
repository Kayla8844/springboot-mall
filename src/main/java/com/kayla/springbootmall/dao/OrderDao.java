package com.kayla.springbootmall.dao;

import com.kayla.springbootmall.dto.CreateOrderRequest;
import com.kayla.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}
