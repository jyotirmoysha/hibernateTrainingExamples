package com.dao;

import java.util.List;

import com.domain.Product;

public interface IProductDao {

	int save(Product product);

	void update(Product product);

	void delete(int id);

	Product getProductById(int id);

	List<Product> getAllProducts();
}
