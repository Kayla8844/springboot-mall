package com.kayla.springbootmall.service.impl;

import com.kayla.springbootmall.dao.ProductDao;
import com.kayla.springbootmall.model.Product;
import com.kayla.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
