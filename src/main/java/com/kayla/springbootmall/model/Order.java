package com.kayla.springbootmall.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Order {
    Integer orderId;
    Integer userId;
    Integer totalAmount;
    Date createdDate;
    Date lastModifiedDate;
}
