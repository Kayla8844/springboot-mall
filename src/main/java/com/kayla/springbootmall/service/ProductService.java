package com.kayla.springbootmall.service;

import com.kayla.springbootmall.dao.ProductQueryParams;
import com.kayla.springbootmall.dto.ProductRequest;
import com.kayla.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
