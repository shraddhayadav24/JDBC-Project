package com.product.controller;

import com.product.service.ProductService;

public class GetAllProductController {
	public static void main(String[] args) {
		ProductService productService=new ProductService();
		productService.getALLProduct(null);
	}
}
