package com.product.controller;


import com.product.dto.CustomerDto;
import com.product.service.CustomerService;


public class CustomerController {
	public static void main(String[] args) {
		
         CustomerDto customerDto=new CustomerDto();
           customerDto.setId(4);
           customerDto.setName("jb");
           customerDto.setAddress("mankhurd");

	CustomerService customerService= new CustomerService();
	CustomerDto c=customerService.saveCustomer(customerDto);
	if(c!=null) {
		System.out.println(c.getId()+"savedsuccessfully");
	}

		
	}
}
