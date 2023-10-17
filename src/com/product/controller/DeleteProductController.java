package com.product.controller;

import com.product.service.ProductService;

public class DeleteProductController {
	public static void main(String[] args) {
		ProductService productService= new ProductService();
		
		boolean res=productService.DeleteProductById(2, "coffee");
		System.out.println(res);
	}
}
