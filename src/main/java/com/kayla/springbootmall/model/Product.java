package com.kayla.springbootmall.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kayla.springbootmall.constant.ProductCategory;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Product {
    @JsonProperty("productId")
    private Integer product_id;

    @JsonProperty("productName")
    private String product_name;
    private ProductCategory category;

    @JsonProperty("imageUrl")
    private String image_url;
    private Integer price;
    private Integer stock;
    private String description;

    @JsonProperty("createdDate")
    private Date created_date;

    @JsonProperty("lastModifiedDate")
    private Date last_modified_date;
}
