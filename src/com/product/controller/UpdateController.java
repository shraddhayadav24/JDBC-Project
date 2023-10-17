package com.product.controller;

import com.product.service.CustomerService;

public class UpdateController {
	public static void main(String[] args) {
		CustomerService customerService=new CustomerService();
		boolean res=customerService.UpdateCustomerById(1, "shardulnull", "Sewri");
		System.out.println(res);
	}
}
