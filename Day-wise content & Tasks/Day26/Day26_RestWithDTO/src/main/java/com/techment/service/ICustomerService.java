package com.techment.service;

import java.util.List;

import com.techment.dto.CustomerDto;

public interface ICustomerService {
	
	public String addCustomer (CustomerDto customerDto);

	public List<CustomerDto> viewAllCustomer();
	
	CustomerDto viewCustomerById(int id);	
}
