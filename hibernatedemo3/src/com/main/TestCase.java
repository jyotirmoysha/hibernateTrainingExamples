package com.main;

import com.dao.IProductDao;
import com.dao.ProductDaoImpl;
import com.domain.Product;
import com.util.HibernateUtil;

public class TestCase {

	public static void main(String[] args) {
		
		IProductDao productDao = new ProductDaoImpl();
		
		System.out.println("---------------Insert Product--------------");
		System.out.println(productDao.save(new Product(null, "LG", 9090d)));
		System.out.println(productDao.save(new Product(null, "Apple", 39090d)));
		System.out.println(productDao.save(new Product(null, "Samsung", 19090d)));
		System.out.println();
		
		System.out.println("---------------Get All Products--------------");
		productDao.getAllProducts().forEach((product) -> System.out.print(product));
		
		System.out.println("---------------Update Product--------------");
		productDao.update(new Product(3, "Samsung", 29090d));
		System.out.println();

		System.out.println("---------------Get Single Products--------------");
		System.out.println(productDao.getProductById(3));
	
		System.out.println("---------------Delete Product--------------");
		productDao.delete(3);
		System.out.println();
		
		System.out.println("---------------Get All Products--------------");
		productDao.getAllProducts().forEach((product) -> System.out.print(product));
	
		HibernateUtil.clearSessionFactory();
	}
}







