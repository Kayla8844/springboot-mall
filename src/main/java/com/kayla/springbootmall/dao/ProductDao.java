package com.kayla.springbootmall.dao;

import com.kayla.springbootmall.constant.ProductCategory;
import com.kayla.springbootmall.dto.ProductRequest;
import com.kayla.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
