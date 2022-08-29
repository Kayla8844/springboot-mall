package com.kayla.springbootmall.model;

import com.kayla.springbootmall.constant.ProductCategory;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Product {
    private Integer product_id;
    private String product_name;
    private ProductCategory category;
    private String image_url;
    private Integer price;
    private Integer stock;
    private String description;
    private Date created_date;
    private Date last_modified_date;
}
