package com.kayla.springbootmall.dao;

import com.kayla.springbootmall.dto.ProductRequest;
import com.kayla.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
