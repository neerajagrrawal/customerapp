package com.capgemini.customerapp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.capgemini.customerapp.entity.Customer;
import com.capgemini.customerapp.exception.CustomerNotFound;
import com.capgemini.customerapp.repository.CustomerRepository;
import com.capgemini.customerapp.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository ;
	
	@Override
	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer) ;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return customerRepository.save(customer) ;
	}

	@Override
	public void deleteCustomer(Customer customer) {
		customerRepository.delete(customer);

	}

	@Override
	public Customer findCustomerById(long customerId) throws CustomerNotFound {
		Optional<Customer> optionalCustomer = customerRepository.findById((int) customerId) ;
		if(optionalCustomer.isPresent())
			return optionalCustomer.get();
		throw new CustomerNotFound("Customer does not exists");
	}

	@Override
	public List<Customer> findAllCustomer() {
		List<Customer> allCustomers=customerRepository.findAll() ;
		return allCustomers ;
	}

	@Override
	public boolean authenticate(Customer customer) {
		return false;
		//customerRepository.exists() ;
	}

	@Override
	public boolean updatePassword(String newPassword) {
		// TODO Auto-generated method stub
		return false;
	}

}
