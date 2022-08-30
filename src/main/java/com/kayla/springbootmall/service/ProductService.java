package com.kayla.springbootmall.service;

import com.kayla.springbootmall.dto.ProductRequest;
import com.kayla.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
