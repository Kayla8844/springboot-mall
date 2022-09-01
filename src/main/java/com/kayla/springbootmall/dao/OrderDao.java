package com.kayla.springbootmall.dao;

import com.kayla.springbootmall.dto.CreateOrderRequest;
import com.kayla.springbootmall.model.Order;
import com.kayla.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Order getOrderById(Integer orderId);

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}
