package com.kayla.springbootmall.rowmapper;

import com.kayla.springbootmall.constant.ProductCategory;
import com.kayla.springbootmall.model.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {
        Product product = new Product();

        product.setProduct_id(resultSet.getInt("product_id"));
        product.setProduct_name(resultSet.getString("product_name"));

        // 分類 string 轉型成 enum 類型
        String categoryStr = resultSet.getString("category");
        ProductCategory category = ProductCategory.valueOf(categoryStr);
        product.setCategory(category);

        // 寫成一行
        // product.setCategory(ProductCategory.valueOf(resultSet.getString("category")));

        product.setImage_url(resultSet.getString("image_url"));
        product.setPrice(resultSet.getInt("price"));
        product.setStock(resultSet.getInt("stock"));
        product.setDescription(resultSet.getString("description"));
        product.setCreated_date(resultSet.getTimestamp("created_date"));
        product.setLast_modified_date(resultSet.getTimestamp("last_modified_date"));

        return product;
    }
}
