package com.kayla.springbootmall.dto;

import com.kayla.springbootmall.constant.ProductCategory;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderQueryParams {
    private Integer userId;
    private Integer limit;
    private Integer offset;
}
