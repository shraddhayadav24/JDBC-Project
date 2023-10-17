package com.product.service;

import com.product.dao.ProductDao;
import com.product.dto.ProductDto;

public class ProductService {
	
	ProductDao productDao=new ProductDao();
	
	public ProductDto saveProduct(ProductDto product) {
		return productDao.saveProduct(product);
	}
	
	
	public boolean UpdateProductById(int id,String name,int price) {
		return productDao.UpdateProductById(id, price);
	}
	
	
	public boolean DeleteProductById(int id,String name) {
		return productDao.DeleteProductById(id, name);
	}
	
	
	public ProductDto getALLProduct(ProductDto product) {
		return productDao.getALLProduct(product);
	}
}
