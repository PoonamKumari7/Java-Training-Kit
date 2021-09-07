package com.techment.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.dto.CustomerDto;
import com.techment.entity.Customer;
import com.techment.exception.IdNotFoundException;
import com.techment.service.ICustomerService;

@RestController
@RequestMapping(value = "/customerController")
public class CustomerController {
	
		@Autowired
		ICustomerService iCustomerService;

		@GetMapping(value = "/viewAllCustomers")
		public List<CustomerDto> viewCustomer()
		{
			return iCustomerService.viewAllCustomer();
		}
		
		@PostMapping(value = "/addNewCustomer")
		public String addNewEmployee(@RequestBody Customer customer)
		{
			CustomerDto dto = new CustomerDto();
			return iCustomerService.addCustomer(dto);
		}
		
		/**********************************************************************/
		
//		@GetMapping(value = "/getById/{id}")
//		public CustomerDto getById(@PathVariable int id)
//		{
//			CustomerDto customerdto = iCustomerService.viewCustomerById(id);
//			return customerdto;
//		}
		
		@GetMapping(value = "/getById/{id}")
		public CustomerDto getById(@PathVariable int id)
		{
			try {
				return iCustomerService.viewCustomerById(id);
			}
			
			catch(NoSuchElementException e) {
				throw new IdNotFoundException("No Id present to get");
			}
		}
		
		
		
		
		/*******************************************************************/
		
		@ExceptionHandler(value = IdNotFoundException.class)
		public ResponseEntity<Object> myException(IdNotFoundException exception)
		{
			return new ResponseEntity<Object>(exception.getMsg(), HttpStatus.NOT_FOUND);
		}
		
		
		
		
		
		
		
		
		
	}

