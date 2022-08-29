package com.kayla.springbootmall.dao;

import com.kayla.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
