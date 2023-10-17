package com.product.service;

import com.product.dao.CustomerDao;
import com.product.dto.CustomerDto;

public class CustomerService {
	CustomerDao customerDao=new CustomerDao();
	
	public CustomerDto saveCustomer(CustomerDto customer) {
		return customerDao.saveCustomer(customer);
		
	}
	
	public boolean UpdateCustomerById(int id,String name,String address) {
		boolean res= customerDao.UpdateCustomerById(id, name, address);
		return res;
	}
	
	public boolean DeleteCustomerById(int id,String name) {
		boolean res= customerDao.DeleteCustomerById(id, name);
		return res;
	}
	
	public 	CustomerDto getALLCustomer(CustomerDto customer) {
		return customerDao.getALLCustomer(customer);
	}
}
