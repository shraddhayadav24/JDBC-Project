package com.product.controller;

import com.product.service.CustomerService;

public class GetAllCustomer {
	public static void main(String[] args) {
		CustomerService customerService=new CustomerService();
		customerService.getALLCustomer(null);
	}
}
