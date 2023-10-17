package com.product.controller;



import com.product.dto.ProductDto;
import com.product.service.ProductService;

public class ProductController {
	public static void main(String[] args) {
		ProductDto productDto=new ProductDto();
        productDto.setId(5);
        productDto.setName("Eyeliner");
        productDto.setPrice(150);
        
        
        ProductService productService= new ProductService();
    	ProductDto c=productService.saveProduct(productDto);
    	if(c!=null) {
    		System.out.println(c.getId()+"savedsuccessfully");
    	}

	}
}
