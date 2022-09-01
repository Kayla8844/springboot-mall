package com.kayla.springbootmall.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItem {
    Integer orderItemId;
    Integer orderId;
    Integer productId;
    Integer quantity;
    Integer amount;
}
