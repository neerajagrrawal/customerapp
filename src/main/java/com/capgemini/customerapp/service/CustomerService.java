package com.capgemini.customerapp.service;

import java.util.List;

import com.capgemini.customerapp.entity.Customer;
import com.capgemini.customerapp.exception.CustomerNotFound;

public interface CustomerService {

	public Customer addCustomer(Customer customer) ;
	
	public Customer updateCustomer(Customer customer) ;
	
	public void deleteCustomer(Customer customer) ;
	
	public Customer findCustomerById(long customerId) throws CustomerNotFound ;
	
	public List<Customer> findAllCustomer() ;
	
	public boolean authenticate(Customer customer) ;
	
	public boolean updatePassword(String newPassword) ;
}
