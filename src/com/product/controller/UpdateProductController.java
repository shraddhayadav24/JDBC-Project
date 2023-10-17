package com.product.controller;

import com.product.service.ProductService;

public class UpdateProductController {
	public static void main(String[] args) {
		ProductService productService=new ProductService();
		boolean res=productService.UpdateProductById(1, "milk", 60);
		System.out.println(res);
	}
}
