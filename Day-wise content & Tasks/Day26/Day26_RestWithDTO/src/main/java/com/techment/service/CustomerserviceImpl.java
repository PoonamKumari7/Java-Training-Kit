package com.techment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.techment.dao.ICustomerDao;
import com.techment.dto.CustomerDto;
import com.techment.entity.Customer;

@Service
public class CustomerserviceImpl implements ICustomerService{
	
	@Autowired
	ICustomerDao dao;

	@Override
	public String addCustomer(CustomerDto customerDto) {
		Customer customer = new Customer();
		customer.setName(customerDto.getName());
		customer.setAddress(customerDto.getAddress());
		customer.setAge(customerDto.getAge());
		customer.setEmail(customerDto.getEmail());
		dao.save(customer);
		return "Custmer details are added";
	}

	@Override
	public List<CustomerDto> viewAllCustomer() {
		
		List<Customer> customers = dao.findAll();
		List<CustomerDto> customerDtos = new ArrayList<CustomerDto>();
		
		for(Customer c : customers)
		{
			customerDtos.add(new CustomerDto(c.getId(), c.getName(), c.getAddress(), c.getAge()));
		}
		return customerDtos;
	}
	
	@Override
	public CustomerDto viewCustomerById(int id) throws NoSuchElementException {
		
		Customer  customer = dao.findById(id).get();
		CustomerDto customerDto = new CustomerDto(customer.getId(), customer.getName(), customer.getAddress(), customer.getAge(), customer.getEmail(), customer.getMobile());
		customerDto.setName(customer.getName());
		return customerDto;
	}
}

















